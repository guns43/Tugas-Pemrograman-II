/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.controller;

/**
 *
 * @author windows-11
 */
public class LoginController {
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
}
