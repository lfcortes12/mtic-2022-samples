/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pruebasunitarias.Calculadora;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author luis.cortes
 */
public class CalculadoraTest {
   
     // Test Driven Development (TDD)
     @Test
     public void sumaTest() {
         Calculadora calculadora = new Calculadora();
         double resultado = calculadora.suma(4, 6);
         assertEquals(10, resultado);
     }
     
     @DisplayName("Prueba una suma es un caso normal")
     @Test
     public void dividirTest() throws Exception {
         Calculadora calculadora = new Calculadora();
         double resultado = calculadora.dividir(6, 2);
         assertEquals(4, resultado);
     }
     
     @DisplayName("Prueba una suma cuando el divisor es 0")
     @Test
     public void dividirCuandoDivisorCeroTest() {
         Calculadora calculadora = new Calculadora();
         
         assertThrows(Exception.class, () -> {
             calculadora.dividir(6, 0);
         }, "el divisor no puede ser cero");

        
     }
     
     @Test
     public void any() {
         Calculadora calculadora = new Calculadora();
         try {
             calculadora.dividir(6, 0);
         } catch (Exception ex) {
             fail("Dividio por cero");
         }
     }
     
}
