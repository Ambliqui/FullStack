/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.mapas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ambliqui
 */
public class Main {

//    public static void main(String[] args) {
//        Map<String, Persona> map = new HashMap<>();
//
//        map.put("Uno", new Persona ("Ana", "Torroja"));
//        map.put("Dos", new Persona ("Manolo", "Torroja"));
//        map.put("Tres", new Persona ("Antonio", "Orozco"));
//        map.put("Cuatro", new Persona ("Amaia", "Montero"));
//        map.put("Cinco", new Persona ("Fredy", "Mercury"));
//        
//        System.out.println(map.size());
//        map.keySet().remove("Uno");
//        //Serializable
//        
//        for (Map.Entry<String, Persona> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        
//    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Persona ("Isi", "Seren"));
        oos.close();
        
        FileInputStream fileIn=new FileInputStream("t.tmp");
        ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("fileIn"));
        Persona p = (Persona) entrada.readObject();
        entrada.close();
                        
        }
}
