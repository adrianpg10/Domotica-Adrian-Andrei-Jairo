/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author andrei
 */
public class Reloj {
    private LocalTime hora = LocalTime.now();

    public  void mostrarHora(){
        LocalTime ahora = hora;
        System.out.println("Hora actual: " + ahora);
    }
    
    public  void mostrarFecha(){
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es " + hoy);
        
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void modificarHora(){
     
        
        //nuevaHora = new LocalTime(hora,minuto,segundo,0); falta arreglar esto
        // this.hora = nuevaHora;
    
    }

    public Reloj() {
        this.hora = LocalTime.now();
    }
    
}
