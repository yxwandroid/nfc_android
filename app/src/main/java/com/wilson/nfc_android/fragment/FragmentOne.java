package com.wilson.nfc_android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wilson.nfc_android.R;
import com.wilson.nfc_android.api.LoginApi;
import com.wilson.nfc_android.model.UserInfo;
import com.wilson.nfc_android.net.RetrofitManager;

import java.util.ArrayList;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 *@describe: ""
 *@author : willson { http://xiaowutongxue.com}
 *@Data :  "2016/11/24"  "下午6:02"
 **/

public class FragmentOne extends Fragment {


//    ArrayList

    private static final String TAG = FragmentOne.class.getName();
    private  static  int i =0;
    public FragmentOne() {

        Log.d(TAG, "FragmentOne: "+i);
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(TAG, "FragmentOne: "+i);

        RetrofitManager.getInstance().createReq(LoginApi.class).getUserInfo(21)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<UserInfo>() {
            @Override
            public void onCompleted() {
                Log.d("wilson","www");
            }

            @Override
            public void onError(Throwable e) {
                Log.d("wilson",e.toString());
            }

            @Override
            public void onNext(UserInfo userInfo) {
                Log.d("wilson ",userInfo.getMsg());
            }


        });



        return inflater.inflate(R.layout.layout_one,container,false);

    }

}
