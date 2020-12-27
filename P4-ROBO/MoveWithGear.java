/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
/**
 *
 * @author Mukesh
 */
import ch.aplu.robotsim.*;
public class MoveWithGear {
    MoveWithGear()
    {
        NxtRobot robot=new NxtRobot();
        Gear gear=new Gear();
        robot.addPart(gear);
        gear.forward(400);
        gear.setSpeed(20);
        gear.left(800);
        gear.forward(200);
        gear.right(480);
        robot.exit();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MoveWithGear m=new MoveWithGear();
    }
    
}
