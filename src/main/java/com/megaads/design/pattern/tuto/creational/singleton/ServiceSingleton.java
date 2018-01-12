/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megaads.design.pattern.tuto.creational.singleton;

/**
 *
 * @author phuluong
 */
public class ServiceSingleton {

    private static OrderService orderService;

    public static OrderService getOrderServiceInstance() {
        if (orderService == null) {
            orderService = new OrderService();
        }
        return orderService;
    }

}
