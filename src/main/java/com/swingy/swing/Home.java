package com.swingy.swing;

import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.swingy.exception.ValidationException;
import com.swingy.model.Hero;
import com.swingy.model.HeroType;
import com.swingy.service.HeroFactory;

import jakarta.validation.ConstraintViolation;

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
        try (Scanner scanner = new Scanner(System.in)) {
            HeroType type = null;
            String name;

            System.out.println("Select a Hero");
            for(HeroType heroType: HeroType.values()) {
                System.out.println(heroType.getId() + ": " + heroType.getName());
            }

            while(type == null) {
                int choice = scanner.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Knight is selected");
                        type = HeroType.KNIGHT;
                        break;
                    case 2:
                        System.out.println("Hunter is selected");
                        type = HeroType.HUNTER;
                        break;
                    case 3:
                        System.out.println("Princess is selected");
                        type = HeroType.PRINCESS;
                        break;
                    case 4:
                        System.out.println("Archer is selected");
                        type = HeroType.ARCHER;
                        break;
                    default:
                        System.out.println("Select number between 1 ~ 3.");
                        break;
                }
            }

            System.out.println("Choose a name for the hero: ");
            // to read newline after number.
            scanner.nextLine();
            while (true) {
                name = scanner.nextLine();

                try {
                    Hero hero = HeroFactory.getInstance().create(name, type);

                    System.out.println("hero created!");
                    System.out.println("type: " + hero.getType().getName());
                    System.out.println("name: " + hero.getName());
                    break ;
                } catch (ValidationException e) {
                    Set<ConstraintViolation<Hero>> violations = e.getViolations();
                    for (ConstraintViolation<Hero> v : violations) {
                        System.out.println(v.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println("Something happened.");
                }
            }
        }
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