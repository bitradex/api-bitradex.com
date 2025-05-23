package com.ex.api.client.spot;

import com.ex.api.dto.CommonResponse;
import com.ex.api.dto.spot.SpotPostOrderRequest;
import retrofit2.Call;
import retrofit2.http.*;

public interface SpotApiService {

    @POST("/v1/spot/order")
    Call<CommonResponse> postOrder(@Body SpotPostOrderRequest request);

    @GET("/v1/spot/order/{id}")
    Call<CommonResponse> getOrder(@Path("id")Long id);

    @GET("/v1/spot/order")
    Call<CommonResponse> queryOrder(@Query("orderId") Long orderId);

    @DELETE("/v1/spot/order/{id}")
    Call<CommonResponse> delOrder(@Path("id")Long id);
}
