package com.khilman.tempatterdekat_kotlinmvp.Model

import com.khilman.tempatterdekat_kotlinmvp.ResponseResto.Result

/**
 * Created by root on 9/20/17.
 */
interface ModelPlace {
    fun Success(data : List<Result>, status : String)
    fun Error(error : String)
}