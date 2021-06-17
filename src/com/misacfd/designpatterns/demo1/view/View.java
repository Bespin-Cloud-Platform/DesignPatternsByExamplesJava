package com.misacfd.designpatterns.demo1.view;

import com.misacfd.designpatterns.demo1.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton helloButton;
    private JButton goodbyeButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");

        this.model = model;

        helloButton = new JButton("Hello there.");
        goodbyeButton = new JButton("Goodbye.");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(helloButton, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(goodbyeButton, gc);

        helloButton.addActionListener(this::actionPerformed);
        goodbyeButton.addActionListener(this::actionPerformed);

        goodbyeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hang on ...");
            }
        });

        setSize(1280, 720);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == helloButton) {
            System.out.println("Would you be my girl friend ?");
        } else {
            System.out.println("Some other button.");
        }
    }
}
