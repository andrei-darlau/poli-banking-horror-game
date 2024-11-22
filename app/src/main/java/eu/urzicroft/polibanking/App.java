package eu.urzicroft.polibanking;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ai card la BCR?");

        frame.add(new JButton("Click or die"));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}