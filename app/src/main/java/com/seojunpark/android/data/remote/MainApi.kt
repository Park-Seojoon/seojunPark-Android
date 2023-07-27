package com.seojunpark.android.data.remote

import com.seojunpark.android.data.dto.MainResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MainApi {

    @GET("user/article/list")
    suspend fun loadList(
        @Header("Authorization") accessToken: String
    ): Response<MainResponse>
}