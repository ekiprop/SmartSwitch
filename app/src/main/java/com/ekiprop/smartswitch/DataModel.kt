package com.ekiprop.smartswitch

import com.squareup.moshi.Json


data class DataModel (

    @field:Json(name = "id") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "switch1") val switch1: String,
    @field:Json(name = "switch2") val switch2: String,
    @field:Json(name = "switch3") val switch3: String,
    @field:Json(name = "phone_no") val phone_no: String


    )