package com.caveofprogramming.designpatterns.observerexample.controller;

import com.caveofprogramming.designpatterns.observerexample.model.Model;
import com.caveofprogramming.designpatterns.observerexample.view.LoginFormEvent;
import com.caveofprogramming.designpatterns.observerexample.view.LoginListener;
import com.caveofprogramming.designpatterns.observerexample.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println(String.format("Login event received: Name = %s; Password = %s", event.getName(), event.getPassword()));
    }


}