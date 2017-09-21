package com.khilman.tempatterdekat_kotlinmvp.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.khilman.tempatterdekat_kotlinmvp.Fragment.PlaceFragment

/**
 * Created by root on 9/20/17.
 */
class tabAdapter(fm: FragmentManager ?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return PlaceFragment("cafe")
        } else if (position == 1){
            return PlaceFragment("lodging")
        } else {
            return PlaceFragment("hospital")
        }

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
  //      TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 3;
    }

}