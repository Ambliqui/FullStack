/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.agenda.util;

import java.util.*;

/*
 * @author Mefisto
 */
public class Datos {
    public static String getData(String msg){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(msg);
        return keyboard.nextLine();
    }
}