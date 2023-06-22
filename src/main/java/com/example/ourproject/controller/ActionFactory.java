package com.example.ourproject.controller;

import com.example.ourproject.controller.action.Action;

public class ActionFactory {

    private static ActionFactory instance = new ActionFactory();

    private ActionFactory() {}

    public static ActionFactory getInstance() {
        return instance;
    }

    public static Action getAction(String command) {
        Action action = null;



        return action;
    }

}

