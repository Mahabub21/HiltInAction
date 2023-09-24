package com.mmk.hiltwithmvvmretrofit.retrofit

import com.mmk.hiltwithmvvmretrofit.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}