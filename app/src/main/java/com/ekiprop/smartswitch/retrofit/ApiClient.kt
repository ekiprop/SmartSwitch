package com.ekiprop.smartswitch.retrofit


import retrofit2.Retrofit

import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient {

    var BASE_URL:String="http://10.0.2.2:8000/"
    val getClient: ApiInterface
        get() {

            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.example.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()



            return retrofit.create(ApiInterface::class.java)

        }

}
