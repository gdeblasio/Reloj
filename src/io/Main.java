package io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame  {

    private final Model model;

    public Main() throws HeadlessException {
        this.model = new Model();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setResizable(false);
        this.setTitle("Reloj");
        this.setLocationRelativeTo(null);
        this.add(modelDisplay());
    }

    private Component modelDisplay() {
        return new ModelDisplay(model);
    }

    public void execute() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main().execute();
    }

    private KeyListener keyListener() {
        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
    }

    private Component button() {
        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        return jButton;
    }

}

