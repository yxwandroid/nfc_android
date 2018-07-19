package com.wilson.nfc_android.api;


import com.wilson.nfc_android.model.requestModel.User;
import com.wilson.nfc_android.model.responsemodel.UserInfo;
import com.wilson.nfc_android.model.responsemodel.WrapperRspEntity;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author zjh
 * @date 2016/8/19
 */
public interface UserApi {
//    @FormUrlEncoded
//    @POST("user/{userName}")
//    Observable<WrapperRspEntity<User>> loginReq(@Path("userName") String userName, @Field("pwd") String pwd);

//
//@POST("test.php")
//Observable<ResponseBody> login(
//        @Field("no") String no,
//        @Field("pass") String pass);

//    {
//        "password": "wilson",
//            "username": "wilson"
//    }


    @POST("user/login")
    Observable<WrapperRspEntity<UserInfo>> login(@Body User userInfo);


    @GET("user/{userId}")
    Observable<WrapperRspEntity<UserInfo>> getUserInfo(@Path("userId") int userId);
}
