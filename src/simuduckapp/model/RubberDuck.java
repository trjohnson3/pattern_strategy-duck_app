/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduckapp.model;

import simuduckapp.behavior.FlyNoWay;
import simuduckapp.behavior.Squeek;

/**
 *
 * @author trjoh
 */
public class RubberDuck extends Duck{
    
    public RubberDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeek();
    }
    
    @Override
    public void display() {
        System.out.println("Look! I'm a rubber duck.");
    }
}
