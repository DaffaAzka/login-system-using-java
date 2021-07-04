package com.dest.service;

import com.dest.data.UserData;

public class SignIn {

    public String getUsername;
    public String getEmail;

    public UserData userData = new UserData();

    public boolean register(String username, String email, String password) {

        if (userData.usernameUser.size() < 1) {
            userData.usernameUser.add(username);
            userData.emailUser.add(email);
            userData.passwordUser.add(password);
            System.out.println("Register Berhasil");
            return true;
        } else {
            for (int i = 0; i < 10; i++) {
                if (userData.usernameUser.get(i).equals(username) || userData.emailUser.get(i).equals(email)) {
                    System.out.println("Username Atau Email Yang Anda Masukan Sudah Di Gunakan");
                    return false;
                } else {
                    userData.usernameUser.add(username);
                    userData.emailUser.add(email);
                    userData.passwordUser.add(password);
                    System.out.println("Register Berhasil");
                    return true;
                }
            }
        }

//        if (userData.usernameUser == null || userData.passwordUser == null) {
//
//            System.out.println("Maaf Data Tidak Boleh Null");
//
//        } else {
//            if (userData.usernameUser == null || userData.passwordUser == null) {
//
//                System.out.println("Maaf Data Tidak Boleh Null");
//
//            } else {
//                userData.usernameUser.add(username);
//                userData.passwordUser.add(password);
//                System.out.println("Register Berhasil");
//                return true;
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            if (userData.usernameUser.get(i) == username) {
//                System.out.println("Username Yang Anda Pilih Sudah Di Gunakan");
//                return false;
//            } else {
//                userData.usernameUser.add(username);
//                userData.passwordUser.add(password);
//                System.out.println("Register Berhasil");
//                return true;
//            }
//        }

        return false;
    }

    public boolean login(String username, String password) {
        for (int i = 0; i < userData.usernameUser.size() ; i++) {
            if (username.equals(userData.usernameUser.get(i))) {
                if (password.equals(userData.passwordUser.get(i))) {
                    System.out.println("Berhasil Masuk");
                    this.getUsername = userData.usernameUser.get(i);
                    this.getEmail = userData.emailUser.get(i);
                    return true;
                }
                break;
            }
        }
        System.out.println("Username Atau Password Yang Anda Masukan Salah");
        return false;
    }
}
