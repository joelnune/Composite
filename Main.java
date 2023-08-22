/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite.myPackage;

public class Main {
    public static void main(String[] args) {
        // Create individual components
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        HD hd = new HD();

        // Create a composite device
        CompositeDevice compositeDevice = new CompositeDevice();
        compositeDevice.addComponent(keyboard);
        compositeDevice.addComponent(mouse);
        compositeDevice.addComponent(monitor);
        compositeDevice.addComponent(hd);

        // Display information about the composite device
        compositeDevice.displayInfo();
    }
}

