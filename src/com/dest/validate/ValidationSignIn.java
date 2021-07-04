package com.dest.validate;

public class ValidationSignIn {

    public boolean validationSignIn(String username, String email, String password) {
//        if (username.length() > 8 || username != null || username != "") {
//            if (password.length() > 8 || password != null || password != "") {
//                return  true;
//            } else {
//                System.out.println("Username Yang Anda Masukan Tidak Memenuhi Standar");
//                return false;
//            }
//        }
//
//        System.out.println("Username Yang Anda Masukan Tidak Memenuhi Standar");
//        return false;
//    }

        if (username == null || username.equals("") || email == null || email.equals("") || password.length() < 8 || password == null || password.equals("")) {
            System.out.println("Username, Email Atau Password Yang Anda Masukan Tidak Memenuhi Standar");
            return false;
        } else {
            return true;
        }

//        if (username == null || username.equals("") || password.length() < 8 || password == null || password.equals("")) {
//            System.out.println("Username, Email Atau Password Yang Anda Masukan Tidak Memenuhi Standar");
//            return false;
//        } else {
//            return true;
//        }
    }

}
