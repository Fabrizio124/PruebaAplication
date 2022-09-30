package com.test.fabrizio.pruebaaplication.model

import com.google.gson.annotations.SerializedName

data class ChuckDataClass(
    @SerializedName("a" ) var a : String,
    @SerializedName("b" ) var b : String,
    @SerializedName("c" ) var c : String,
    @SerializedName("d" ) var d : String,
    @SerializedName("e" ) var e : String,
    @SerializedName("f" ) var f : String
)
