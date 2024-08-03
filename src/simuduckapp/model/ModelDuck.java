/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduckapp.model;

import simuduckapp.behavior.FlyNoWay;
import simuduckapp.behavior.Quack;

/**
 *
 * @author trjoh
 */
public class ModelDuck extends Duck {
    
    public ModelDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("Look at me! I'm a model.");
    }
}
