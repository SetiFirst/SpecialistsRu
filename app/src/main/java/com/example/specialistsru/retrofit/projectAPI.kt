package com.example.specialistsru.retrofit

import Colleague
import retrofit2.http.GET

interface projectAPI {
    @GET("users")
    suspend fun getUserData(): Colleagues
    @GET("users/1")
    suspend fun getUser(): Colleague
}