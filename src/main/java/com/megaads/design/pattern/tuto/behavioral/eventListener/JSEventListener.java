/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.behavioral.eventListener;

/**
 *
 * @author phuluong
 */
public class JSEventListener implements EventListener {

    @Override
    public void onEvent(String event, Object data) {
        System.out.println("On event: " + event);
    }

}