package com.android.dev.mvvm.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.dev.R;
import com.android.dev.databinding.ActivityLoginBinding;
import com.android.dev.mvvm.viewmodel.handler.LoginViewHandler;
import com.android.dev.mvvm.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserModel userModel = ViewModelProviders.of(this).get(UserModel.class);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel viewModel = new LoginViewModel(this,userModel);
        binding.setViewModel(viewModel);
        binding.setViewHandler(new LoginViewHandler(viewModel));
    }
}
