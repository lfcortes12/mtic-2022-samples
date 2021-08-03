/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barrio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis.cortes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Barrio barrio = new Barrio("Castilla", "Kenedy", "Bogotá");
        Direccion direccion1 = new Direccion(14, 74, 15);
        Direccion direccion2 = new Direccion(57, 90, 10);
        Direccion direccion3 = new Direccion(115, 33, 89);
        Direccion direccion4 = new Direccion(200, 1, 11);
        Direccion direccion5 = new Direccion(57, 23, 90);
        barrio.agregarDireccion(direccion1);
        barrio.agregarDireccion(direccion2);
        barrio.agregarDireccion(direccion3);
        barrio.agregarDireccion(direccion4);
        barrio.agregarDireccion(direccion5);
        
        buscar(barrio, direccion3);
        buscar(barrio, new Direccion(34, 543, 34));
    }

    private static void buscar(Barrio barrio, Direccion dir) {
        if (barrio.buscarDireccion(dir) != null) {
            System.out.println("Encontré la dirección: " + dir);
        } else {
            System.out.println("La dirección no existe en el barrio: " + dir);
        }
    }
    
}
