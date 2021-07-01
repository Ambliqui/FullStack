/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocommand;

/**
 *
 * @author Ambliqui
 */
public class Main {
    public static void main(String[] args) {
      ObjetoDomotico oD = new ObjetoDomotico();
      Valvula grifo = new Valvula();
      Command switchUp = new EncenderCommand(oD);
      Command switchDown = new ApagarCommand(oD);
      Command switchStand = new StandbyCommand(oD);
//      if (args.length != 1) {
//         System.err.println("Argument \"ON\" or \"OFF\" is required.");
//         System.exit(0);
//      }
//      // See criticism of this model above:
//      // The switch itself may not be aware of the specific receiver details (the lamp)
//      Switch mySwitch = new Switch(switchUp, switchDown, switchStand);
//      
//      switch (args[0]) {
//         case "ON":
//            mySwitch.flipUp();
//            break;
//         case "OFF":
//            mySwitch.flipDown();
//            break;
//         default:
//            System.err.println("Argument \"ON\" or \"OFF\" is required.");
//            System.exit(-1);
//      }


    }
    
}
