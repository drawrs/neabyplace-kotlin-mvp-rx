package com.khilman.tempatterdekat_kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.widget.TabHost
import com.khilman.tempatterdekat_kotlinmvp.Adapter.tabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setup tabs
        tabs.addTab(tabs.newTab().setText("Restoran"))
        tabs.addTab(tabs.newTab().setText("Hotel"))
        tabs.addTab(tabs.newTab().setText("Rumah Sakit"))

        var adapter = tabAdapter(supportFragmentManager)
        pager.adapter = adapter


        // tabnya ganti
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        // event click tab
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
             //   TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.position?.let { pager.setCurrentItem(it) }
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}
