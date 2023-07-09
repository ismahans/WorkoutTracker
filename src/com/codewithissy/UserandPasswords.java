package com.codewithissy;

import java.util.HashMap;

public class UserandPasswords {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    UserandPasswords(){
        loginInfo.put("issy", "2023");
        loginInfo.put("ali", "cameo");
        loginInfo.put("amy", "blue");
        loginInfo.put("Theo", "heartland");
    }

    HashMap getLogininfo(){
        return loginInfo;
    }
}
