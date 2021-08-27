/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

/**
 *
 * @author luis.cortes
 */
public class Calculadora {
    
    private Validador validador;
    
    public double suma(double a, double b) {
        return a + b;
    }
    
    public double dividir(double a, double b) throws Exception {
        if(b == 0) {
            throw new Exception("el divisor no puede ser cero");
        }
        return a / b;
    }
    
}
