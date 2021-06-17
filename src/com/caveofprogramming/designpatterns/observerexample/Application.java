package com.caveofprogramming.designpatterns.observerexample;

import javax.swing.SwingUtilities;

import com.caveofprogramming.designpatterns.observerexample.controller.Controller;
import com.caveofprogramming.designpatterns.observerexample.model.Model;
import com.caveofprogramming.designpatterns.observerexample.view.View;

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

        Controller controller = new Controller(view, model);

        view.setLoginListener(controller);
    }

}