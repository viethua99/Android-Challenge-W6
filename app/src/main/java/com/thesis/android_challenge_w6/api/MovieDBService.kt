package com.thesis.android_challenge_w6.rest


import com.thesis.android_challenge_w6.movie.NowPlayingMoviesResp
import com.thesis.android_challenge_w6.movie.TopRatedMoviesResp
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDBService {

    @GET("movie/now_playing")
    suspend fun  listNowPlayMovies(
        @Query("language") language: String, @Query("page") page: Int, @Query("api_key") apiKey: String
    ): NowPlayingMoviesResp

    @GET("movie/top_rated")
    suspend fun listTopRatedMovies(
         @Query("api_key") apiKey: String, @Query("page") page: Int, @Query("language") language: String
    ): TopRatedMoviesResp
}