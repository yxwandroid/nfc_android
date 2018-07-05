package com.wilson.nfc_android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wilson.nfc_android.R;


/**
 *@describe: ""
 *@author : willson { http://xiaowutongxue.com}
 *@Data :  "2016/11/24"  "下午6:02"
 **/

public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_three,container,false);
    }

}
