package com.mycompany.composite.myPackage;

import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class CompositeDevice implements DeviceComponent {
    private List<DeviceComponent> components = new ArrayList<>();

    public void addComponent(DeviceComponent component) {
        components.add(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Composite Device:");
        for (DeviceComponent component : components) {
            component.displayInfo();
        }
    }
}
