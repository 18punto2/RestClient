package com.pulsar18punto2.marco.restclient;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieInterface {
    @GET("?")
    Call<Movie> searchMovie(@Query("apikey") String apikey,@Query("t") String name);

}
