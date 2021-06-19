package com.misacfd.designpatterns.observer.controller;

import com.misacfd.designpatterns.observer.model.Model;
import com.misacfd.designpatterns.observer.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
