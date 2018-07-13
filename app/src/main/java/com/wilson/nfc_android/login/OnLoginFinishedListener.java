package com.wilson.nfc_android.login;

/**
 * Class Note:登陆事件监听
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    void onSuccess();

    void onError();
}
