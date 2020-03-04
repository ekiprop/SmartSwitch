package com.ekiprop.smartswitch

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataModel (

    @Expose
    @SerializedName("id")
    val id: Integer,
    @Expose
    @SerializedName("switch0")
    val switch0: String,
    @Expose
    @SerializedName("switch1")
    val switch1: String,
    @Expose
    @SerializedName("switch2")
    val switch2: String,
    @SerializedName("switch3")
    val switch3: String,
    @SerializedName("phone_no")
    val phone_no: String

    )