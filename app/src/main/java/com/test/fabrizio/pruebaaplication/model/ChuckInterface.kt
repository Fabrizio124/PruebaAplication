package com.test.fabrizio.pruebaaplication.model

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


interface ChuckInterface {
    @GET
    suspend fun  getChuckNorris(@Url url:String):Response<ChuckDataClass>
}