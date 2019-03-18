/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author andrei
 */
public class Reloj {

    public static void mostrarHora(){
        LocalTime ahora = LocalTime.now();
        System.out.println("Hora actual: " + ahora);
    }
    
    public static void mostrarFecha(){
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es " + hoy);
    }
}
