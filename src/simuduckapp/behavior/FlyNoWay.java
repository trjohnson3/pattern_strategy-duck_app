/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduckapp.behavior;

/**
 *
 * @author trjoh
 */
public class FlyNoWay implements FlyBehavior{
    
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
