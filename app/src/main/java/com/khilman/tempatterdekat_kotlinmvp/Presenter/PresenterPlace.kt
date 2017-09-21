package com.khilman.tempatterdekat_kotlinmvp.Presenter

import com.khilman.tempatterdekat_kotlinmvp.InitRetrofit.APIServices
import com.khilman.tempatterdekat_kotlinmvp.InitRetrofit.InitLibrary
import com.khilman.tempatterdekat_kotlinmvp.Model.ModelPlace
import com.khilman.tempatterdekat_kotlinmvp.ResponseResto.ResponsePlaces
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by root on 9/20/17.
 */
class PresenterPlace {
    var model : ModelPlace? = null

    constructor(model: ModelPlace?) {
        this.model = model
    }

    fun getHotel(location: String, radius: Int, type: String, key: String) {
        var api : APIServices = InitLibrary().getInstance();
        api.request_nearby(location, radius, type, key)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    t: ResponsePlaces? ->
                    var data = t?.results
                    var pesan = t?.status
                    if (data?.size!! > 0){
                        model?.Success(data, pesan!!)
                    }
                })
    }
}