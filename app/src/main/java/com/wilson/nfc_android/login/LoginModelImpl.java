package com.wilson.nfc_android.login;

import android.text.TextUtils;
import android.util.Log;

import com.wilson.nfc_android.api.UserApi;
import com.wilson.nfc_android.model.requestModel.User;
import com.wilson.nfc_android.model.responsemodel.UserInfo;
import com.wilson.nfc_android.model.responsemodel.WrapperRspEntity;
import com.wilson.nfc_android.net.RetrofitManager;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Class Note:如果名字或者密码为空则登陆失败，否则登陆成功
 */
public class LoginModelImpl implements LoginModel {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {

        if (TextUtils.isEmpty(username)){
            listener.onUsernameError();//model层里面回调listener
            return;
        }
        if (TextUtils.isEmpty(password)){
            listener.onPasswordError();
            return;
        }

//        RetrofitManager.getInstance().createReq(UserApi.class).getUserInfo(21)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<UserInfo>() {
//            @Override
//            public void onCompleted() {
//                Log.d("wilson","www");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                listener.onError();
//                Log.d("wilson",e.toString());
//            }
//
//            @Override
//            public void onNext(UserInfo userInfo) {
//
//                listener.onSuccess();
//
//                Log.d("wilson ",userInfo.getMsg());
//            }
//
//
//


        User user = new User("wilson", "wilson");

        RetrofitManager.getInstance().createReq(UserApi.class).login(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<WrapperRspEntity<UserInfo>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(WrapperRspEntity<UserInfo> userInfoWrapperRspEntity) {
                Log.d("wilson ",userInfoWrapperRspEntity.getData().getUsername()+"-------"+userInfoWrapperRspEntity.getData());
            }
        });

    }
}
