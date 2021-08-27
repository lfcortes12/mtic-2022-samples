/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

/**
 *
 * @author luis.cortes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo(1, "America", 1);
        Equipo equipo2 = new Equipo("America", 1);
        Equipo equipo3 = new Equipo();        
        
        System.out.println(equipo1.toString());
        System.out.println(equipo2.toString());
        System.out.println(equipo3.toString());
    }
    
}
