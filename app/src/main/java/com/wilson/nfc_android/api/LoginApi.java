package com.wilson.nfc_android.api;


import com.wilson.nfc_android.model.UserInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author zjh
 * @date 2016/8/19
 */
public interface LoginApi {
//    @FormUrlEncoded
//    @POST("user/{userName}")
//    Observable<WrapperRspEntity<User>> loginReq(@Path("userName") String userName, @Field("pwd") String pwd);

    @GET("user/{userId}")
    Observable<UserInfo> getUserInfo(@Path("userId") int userId);
}
