/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduckapp.model;

import simuduckapp.behavior.FlyWithWings;
import simuduckapp.behavior.Quack;

/**
 *
 * @author trjoh
 */
public class RedheadDuck extends Duck{
    
    public RedheadDuck() {
        super();
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("Look! I'm a Redhead.");
    }
}
