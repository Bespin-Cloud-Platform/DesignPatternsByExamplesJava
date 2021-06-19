package com.misacfd.designpatterns.observer;

import com.misacfd.designpatterns.observer.controller.Controller;
import com.misacfd.designpatterns.observer.model.Model;
import com.misacfd.designpatterns.observer.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
    }
}
