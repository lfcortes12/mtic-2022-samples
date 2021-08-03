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
public class Barrio {

    public List<Direccion> direcciones;
    private String nombre;
    private String sector;
    private String ciudad;

    public Barrio( String nombre, String sector, String ciudad) {
        this.direcciones = new ArrayList<>();
        this.nombre = nombre;
        this.sector = sector;
        this.ciudad = ciudad;
    }

    // setter -> set = establecer/asignar
    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
    
    public void agregarDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public int obtenerNumeroCasas() {
        return this.direcciones.size();
    }

    public Direccion buscarDireccion(Direccion direccionBuscar) {
        Direccion resultado = null;
        
        /*for (int i = 0; i < direcciones.size(); i++) {
            Direccion direccion = direcciones.get(i);
            if (direccion.obtenerCalle() == direccionBuscar.obtenerCalle()
                    && direccion.getCarrera() == direccionBuscar.getCarrera()
                    && direccion.getNumero() == direccionBuscar.getNumero()) {
                resultado = direccion;
                break;
            }
        }*/
        
        // enhanced for-loop
        for (Direccion direccion: direcciones) {
            if (direccion.obtenerCalle() == direccionBuscar.obtenerCalle()
                    && direccion.getCarrera() == direccionBuscar.getCarrera()
                    && direccion.getNumero() == direccionBuscar.getNumero()) {
                resultado = direccion;
                break;
            }
        }
        return resultado;
    }
    
    public String obtenerSector() {
        return this.sector;
    }
}
