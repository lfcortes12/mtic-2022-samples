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
public class Equipo {
    
    private int idEquipo;
    private String nombre;
    private int ranking;
    
    public Equipo() {
        System.out.println("Ejecutando constructor sin params");
    }

    public Equipo(int idEquipo, String nombre, int ranking) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.ranking = ranking;
        System.out.println(String.format("Ejecutando constructor con 3 campos %s - %s - %s", idEquipo, nombre, ranking));
    }

    public Equipo(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
        System.out.println(String.format("Ejecutando constructor con 2 campos %s - %s", nombre, ranking));
    }

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", nombre=" + nombre + ", ranking=" + ranking + '}';
    }
    
    
    
    
    
    
}
