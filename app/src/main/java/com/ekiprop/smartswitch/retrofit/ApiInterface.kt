package com.ekiprop.smartswitch.retrofit

import com.ekiprop.smartswitch.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("switches")
    fun getPhotos(): Call<List<DataModel>>

}
