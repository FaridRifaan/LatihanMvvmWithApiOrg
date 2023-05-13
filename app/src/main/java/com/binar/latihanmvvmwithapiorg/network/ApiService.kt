package com.binar.latihanmvvmwithapiorg.network

import com.binar.latihanmvvmwithapiorg.model.article.ResponseArticles
import com.binar.latihanmvvmwithapiorg.model.source.ResponseDataSource
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines/sources")
    fun getAllSources(
        @retrofit2.http.Query("category") category : String,
        @retrofit2.http.Query("apikey") apikey : String = "a66041dcb98440168503100966823632"
    ) : Call<ResponseDataSource>

    @GET("top-headlines")
    fun gellAllArticles(
        @Query("sources") sources : String,
        @Query("apiKey") apiKey : String = "9fdc48da878d45d79c0bc09860d72ac3"
    ) : Call<ResponseArticles>
}