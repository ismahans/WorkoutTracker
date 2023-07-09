package com.codewithissy;

public class Main {

    public static void main(String[] args) {
        UserandPasswords userandPasswords = new UserandPasswords();
        LoginPage logininPage = new LoginPage(userandPasswords.getLogininfo());
    }
}
