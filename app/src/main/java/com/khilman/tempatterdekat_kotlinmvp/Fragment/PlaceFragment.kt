package com.khilman.tempatterdekat_kotlinmvp.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.khilman.tempatterdekat_kotlinmvp.Adapter.PlacesAdapter
import com.khilman.tempatterdekat_kotlinmvp.Model.ModelPlace
import com.khilman.tempatterdekat_kotlinmvp.Presenter.PresenterPlace

import com.khilman.tempatterdekat_kotlinmvp.R
import com.khilman.tempatterdekat_kotlinmvp.ResponseResto.Result
import kotlinx.android.synthetic.main.fragment_place.*


/**
 * A simple [Fragment] subclass.
 */
class PlaceFragment(type_place: String) : Fragment(), ModelPlace {
    var presenter : PresenterPlace? = null
    var type : String = type_place
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view : View = inflater!!.inflate(R.layout.fragment_place, container, false)
        presenter = PresenterPlace(this)
        presenter?.getHotel("-6.1925297,106.8001397",1000,type,"AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
        Log.d("type", type)
        return view
    }
    override fun Success(data: List<Result>, status: String) {

       if(status.equals("OK")){
           Log.d("Data", "" + data.get(0).name)
           Log.d("Data", "" + status.toString())
           var adapter = PlacesAdapter(data, activity)
           recyclerview.adapter = adapter
           var lienarLM = LinearLayoutManager(activity)
           recyclerview.layoutManager = lienarLM
       }
    }

    override fun Error(error: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}// Required empty public constructor
