package com.ykawakit.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Home {
    public static void show(String mode) throws Exception {
        if ("console".equals(mode))
            console();
        else if("gui".equals(mode))
            gui();
        else
            throw new Exception();
    }

    private static void console() {
        System.out.println("hello world");
    }

    private static void gui() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("test");

        button.setBounds(150, 200, 220, 50);

        frame.add(button);

        frame.setSize(500, 600);

        frame.setVisible(true);
    }
}