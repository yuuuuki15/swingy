package com.swingy;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.swingy.controller.HomeController;

public class Main {
    public static void main(String[] args) {
        Logger.getLogger("org.hibernate").setLevel(Level.WARNING);
        String mode = "console";
        if (args.length > 1) {
            System.out.println("Too many arguments.");
            return ;
        }
        if (args.length > 0) {
            if ("console".equals(args[0]))
                mode = "console";
            else if ("gui".equals(args[0]))
                mode = "gui";
            else {
                System.out.println("Unknown mode: " + args[0]);
                return ;
            }
        }
        System.out.println("mode: " + mode);

        try {
            HomeController.index(mode);
        } catch(Exception e) {
            System.out.println("Something happened.");
        }
    }
}