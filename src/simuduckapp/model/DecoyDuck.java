/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduckapp.model;

import simuduckapp.behavior.FlyNoWay;
import simuduckapp.behavior.NoQuack;

/**
 *
 * @author trjoh
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck() {
        super();
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new NoQuack();
    }
    
    @Override
    public void display() {
        System.out.println("Look! I'm a decoy.");
    }
}
