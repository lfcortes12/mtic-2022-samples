/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barrio;

/**
 *
 * @author luis.cortes
 */
public class Direccion {
    
    private int calle;
    private int carrera;
    private int numero;

    public Direccion(int calle, int carrera, int numero) {
        this.calle = calle;
        this.carrera = carrera;
        this.numero = numero;
    }
    // Getter -> GET = Obtener
    
    public int obtenerCalle() {
        return calle;
    }
    
    public int getCarrera() {
        return carrera;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Calle " + calle + " " + carrera + " - " + numero;
    }
    
}
