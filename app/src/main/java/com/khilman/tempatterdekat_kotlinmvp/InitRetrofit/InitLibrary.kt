package com.khilman.tempatterdekat_kotlinmvp.InitRetrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by root on 9/20/17.
 */
class InitLibrary {
    fun getInit() : Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    fun getInstance() : APIServices {
        return getInit().create(APIServices::class.java)
    }

    //https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&maxheight=400&photoreference=CmRaAAAAaBv1Ljuk-r0NeDEOg38W4XeevaI8ijTSEx8ZIXrhZ9JaNlHiKDYfjzrQ9eFHEVOGI18mO_N71FGVm0NPDpHt9ZeGYzqLLxf4yeAjf_XIVGoGH2BrQJkgSR_nOTYE0ezuEhDtj-tQOChmC0FWx8MMWnwoGhQEdptroUSb7z6QGv6UadynJ3C4Ow&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk

}