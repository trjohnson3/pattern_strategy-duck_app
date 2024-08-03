/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuduckapp;

import simuduckapp.behavior.FlyRocketPowered;
import simuduckapp.model.Duck;
import simuduckapp.model.MallardDuck;
import simuduckapp.model.ModelDuck;

/**
 *
 * @author trjoh
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
