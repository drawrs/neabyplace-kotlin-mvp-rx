package com.khilman.tempatterdekat_kotlinmvp.Adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.khilman.tempatterdekat_kotlinmvp.R
import com.khilman.tempatterdekat_kotlinmvp.ResponseResto.Result

/**
 * Created by root on 9/21/17.
 */
class PlacesAdapter : RecyclerView.Adapter<PlacesAdapter.MyHolder> {
    var data: List<Result> ? = null
    var c: FragmentActivity? = null

    constructor(data: List<Result>?, c: FragmentActivity?) {
        this.data = data
        this.c = c
    }


    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var img = itemView?.findViewById<ImageView>(R.id.img)
        var txtname = itemView?.findViewById<TextView>(R.id.txtname)
        var txtalamat = itemView?.findViewById<TextView>(R.id.txtAlamat)
        var txtstatus = itemView?.findViewById<TextView>(R.id.txtStatus)

    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        var isBuka : Boolean? = null
        isBuka  = data?.get(position)?.openingHours?.openNow
        holder?.txtname?.setText(data?.get(position)?.name)
        holder?.txtalamat?.setText(data?.get(position)?.vicinity)
        Log.d("Buka", "" + isBuka)

        if (isBuka == true){
            holder?.txtstatus?.setTextColor(R.color.green)
            holder?.txtstatus?.setText("Buka")
        } else {
            holder?.txtstatus?.setTextColor(R.color.darkgreen)
            holder?.txtstatus?.setText("Tutup")
        }

        var photoHeight = 200
        var photoWidth = 200
        var referencePhoto = data?.get(position)?.photos?.get(0)?.photoReference
        var APIKey = "AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk"
        var imageUri : String = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=" + photoWidth+ "&maxheight=" + photoHeight+ "&photoreference="+ referencePhoto +"&key=" + APIKey
        Glide.with(c)
             .load(imageUri)
             .into(holder?.img)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var inflater = LayoutInflater.from(c).inflate(R.layout.custom_item, parent, false)
        return MyHolder(inflater)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount() : Int {
        return data?.size!!
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}