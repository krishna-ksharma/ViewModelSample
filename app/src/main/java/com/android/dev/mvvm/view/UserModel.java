package com.android.dev.mvvm.view;

import android.arch.lifecycle.ViewModel;

/**
 * Created by krishnas on 2/3/2018.
 */

public class UserModel extends ViewModel {
    private String email = "";
    private String password = "";

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
