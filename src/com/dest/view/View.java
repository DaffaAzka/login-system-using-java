package com.dest.view;

import com.dest.service.MyProfile;
import com.dest.service.SignIn;
import com.dest.util.InputUtil;
import com.dest.validate.ValidationSignIn;

public class View {
    protected static SignIn signIn = new SignIn();
    protected static ValidationSignIn validationSignIn = new ValidationSignIn();
    protected static MyProfile myProfile = new MyProfile();

    public static void show() {

        System.out.println("Homepage DiskCode");
        System.out.println("Opsi : ");
        System.out.println("1. Login");
        System.out.println("2. Register");
        var input = InputUtil.input("Pilih");

        if (input.equals("1")) {
            login();
        } else if (input.equals("2")) {
            register();
        }
    }

    public static void login() {
        System.out.println("Login :");
        var username = InputUtil.input("Username");
        var password = InputUtil.input("Password");
        var login = signIn.login(username, password);
        if (login == false) {
            show();
        }
    }

    public static void register() {
        System.out.println("Register :");
        var username = InputUtil.input("Username");
        var email = InputUtil.input("Email");
        var password = InputUtil.input("Password");
        var validation = validationSignIn.validationSignIn(username, email, password);
        if (validation == true) {
            signIn.register(username, email, password);
            login();
        }
    }
}
