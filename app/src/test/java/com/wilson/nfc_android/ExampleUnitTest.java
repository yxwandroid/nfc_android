package com.wilson.nfc_android;

import android.util.Log;

import com.wilson.nfc_android.api.UserApi;
import com.wilson.nfc_android.model.requestModel.User;
import com.wilson.nfc_android.model.responsemodel.UserInfo;
import com.wilson.nfc_android.model.responsemodel.WrapperRspEntity;
import com.wilson.nfc_android.net.RetrofitManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.observers.TestSubscriber;
import rx.schedulers.Schedulers;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {


    private UserApi userApi;

    @Before
    public void setUp() {
        userApi = RetrofitManager.getInstance().createReq(UserApi.class);
    }




    @Test
    public void  TestOut(){
        System.out.print("wison");
    }


    /**
     * 单元测试接口
     */
    @Test
    public void login() {
        User user = new User("wilson", "wilson");
        TestSubscriber<WrapperRspEntity<UserInfo>> testSubscriber = new TestSubscriber<>();

        userApi.login(user).subscribe(testSubscriber);

        WrapperRspEntity<UserInfo> userInfoWrapperRspEntity = testSubscriber.getOnNextEvents().get(0);

        String username = userInfoWrapperRspEntity.getData().getUsername();
        System.out.print(username);

    }
}