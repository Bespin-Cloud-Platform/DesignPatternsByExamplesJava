package com.caveofprogramming.designpatterns.demo.controller;

import com.caveofprogramming.designpatterns.demo.model.Model;
import com.caveofprogramming.designpatterns.demo.model.Person;
import com.caveofprogramming.designpatterns.demo.model.PersonDAO;
import com.caveofprogramming.designpatterns.demo.view.LoginFormEvent;
import com.caveofprogramming.designpatterns.demo.view.LoginListener;
import com.caveofprogramming.designpatterns.demo.view.View;

import java.sql.SQLException;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    private PersonDAO personDAO = new PersonDAO();

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

        try {
            personDAO.addPerson(new Person(event.getName(), event.getPassword()));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}