package com.dest.test;

import com.dest.service.SignIn;
import com.dest.util.InputUtil;

public class TestSignIn {
    public static void main(String[] args) {
        SignIn signIn = new SignIn();

//        Register
        signIn.register(InputUtil.input("Username"), InputUtil.input("Email"), InputUtil.input("Password"));
        signIn.userData.usernameUser.forEach(value -> System.out.println(value));
        signIn.userData.emailUser.forEach(value -> System.out.println(value));
        signIn.userData.passwordUser.forEach(value -> System.out.println(value));

//        Login
        signIn.login(InputUtil.input("Username"), InputUtil.input("Password"));
    }
}
