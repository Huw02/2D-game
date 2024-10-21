package main;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        /*System.out.println("Hej og velkommen til hannibals spil!");
        System.out.println("Er du klar? Ja for at spille spille spillet og nej, for at lade være! :D");
        Scanner sc = new Scanner(System.in);
        String scInput = sc.nextLine();
        System.out.println("Du har valgt: " + scInput + " men jeg er skide ligeglad, nu starter spillet!");*/



        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D spil");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        gamePanel.startGameThread();
    }

}
