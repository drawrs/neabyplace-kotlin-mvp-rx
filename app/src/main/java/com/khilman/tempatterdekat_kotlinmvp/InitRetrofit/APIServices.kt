package com.khilman.tempatterdekat_kotlinmvp.InitRetrofit

import com.khilman.tempatterdekat_kotlinmvp.ResponseResto.ResponsePlaces
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by root on 9/20/17.
 */
interface APIServices {
    @GET("json")
    fun request_nearby (
            @Query("location") location: String,
            @Query("radius") radius: Int,
            @Query("type") type: String,
            @Query("key") key: String
    // Prosses emmit ke Observable
    ) :Observable<ResponsePlaces>

    //https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&maxheight=400&photoreference=CmRaAAAAaBv1Ljuk-r0NeDEOg38W4XeevaI8ijTSEx8ZIXrhZ9JaNlHiKDYfjzrQ9eFHEVOGI18mO_N71FGVm0NPDpHt9ZeGYzqLLxf4yeAjf_XIVGoGH2BrQJkgSR_nOTYE0ezuEhDtj-tQOChmC0FWx8MMWnwoGhQEdptroUSb7z6QGv6UadynJ3C4Ow&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk
}