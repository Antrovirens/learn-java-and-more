package com.jw.learnswingui;

import javax.swing.*;

public class LearnSwingUI {

    private JPanel root;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LearnSwingUI");
        frame.setContentPane(new LearnSwingUI().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
