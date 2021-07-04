package com.dest.test;

import com.dest.service.SignIn;
import com.dest.util.InputUtil;
import com.dest.validate.ValidationSignIn;

public class TestValidation {
    public static void main(String[] args) {
        SignIn signIn = new SignIn();
        ValidationSignIn validationSignIn = new ValidationSignIn();

//        Test Validation
        var username = InputUtil.input("Username");
        var email = InputUtil.input("Email");
        var password = InputUtil.input("Password");
        var validation = validationSignIn.validationSignIn(username, email, password);
        if (validation == true) {
            signIn.register(username, email, password);
        }
    }
}
