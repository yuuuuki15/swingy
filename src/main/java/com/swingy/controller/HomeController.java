package com.swingy.controller;

import com.swingy.swing.Home;

public class HomeController {
    public static void index(String mode) throws Exception {
        try {
            Home.show(mode);
        } catch(Exception e) {
            throw new Exception();
        }
    }
}
