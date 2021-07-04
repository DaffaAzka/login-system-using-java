package com.dest.service;

public class MyProfile {

    public SignIn signIn = new SignIn();

    public void myProfile() {
        System.out.println("Username : " + signIn.getUsername);
        System.out.println("Email : " + signIn.getEmail);
    }

}
