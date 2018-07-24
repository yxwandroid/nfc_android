package com.wilson.nfc_android.login;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.wilson.nfc_android.R;
import com.wilson.nfc_android.activity.BaseActivity;

public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {


    private AutoCompleteTextView userName;
    private AutoCompleteTextView password;
    private ProgressBar mProgress;

    private LoginPresenterImpl loginPresenter;
    /**
     * 登录
     */
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        mProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgress.setVisibility(View.GONE);

    }

    @Override
    public void setUsernameError() {
        userName.setError("用户名错误");

    }

    @Override
    public void setPasswordError() {
        password.setError("密码错误");
    }

    @Override
    public void navigateToHome() {

        Toast.makeText(this, "跳转界面", Toast.LENGTH_SHORT).show();

    }

    private void initView() {
        userName = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        password = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        mProgress = (ProgressBar) findViewById(R.id.progress);
        mLogin = (Button) findViewById(R.id.button);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.button:

                loginPresenter.validateCredentials(userName.getText().toString(),password.getText().toString());
                break;
        }
    }
}
