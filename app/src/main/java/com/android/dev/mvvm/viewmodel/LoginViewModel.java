package com.android.dev.mvvm.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.support.v4.content.ContextCompat;

import com.android.dev.R;
import com.android.dev.mvvm.view.UserModel;

/**
 * The login view model.
 */
public class LoginViewModel extends ViewModel {
    /**
     * The Observable for email text color hint.
     */
    private ObservableInt emailTextColorHint;
    /**
     * The Observable for password text color hint.
     */
    private ObservableInt passwordTextColorHint;

    /**
     * The email.
     */
    private String email;
    /**
     * The password.
     */
    private String password;

    private UserModel userModel;

    /**
     * Gets the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
        userModel.setEmail(email);
    }

    /**
     * Gets the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password The password
     */
    public void setPassword(String password) {
        this.password = password;
        userModel.setPassword(password);
    }

    /**
     * Constructor.
     *
     * @param context The current context.
     */
    public LoginViewModel(Context context, UserModel userModel) {
        super(context);
        this.userModel = userModel;
        init();
    }

    /**
     * Helper method to initialize default values.
     */
    private void init() {
        emailTextColorHint = new ObservableInt(ContextCompat.getColor(getContext(), R.color.colorWhite));
        passwordTextColorHint = new ObservableInt(ContextCompat.getColor(getContext(), R.color.colorWhite));
        email = userModel.getEmail();
        password = userModel.getPassword();
    }

    /**
     * Gets the email text color hint.
     */
    public ObservableInt emailTextColorHint() {
        return emailTextColorHint;
    }

    /**
     * Sets the email hint text color.
     *
     * @param hintColor The hint color
     */
    public void setEmailTextColorHint(int hintColor) {
        emailTextColorHint.set(hintColor);
    }

    /* Gets the password hint color. */
    public ObservableInt passwordTextColorHint() {
        return passwordTextColorHint;
    }

    /**
     * Sets the password hint color
     *
     * @param hintColor The password hint color
     */
    public void setPasswordTextColorHint(int hintColor) {
        passwordTextColorHint.set(hintColor);
    }
}
