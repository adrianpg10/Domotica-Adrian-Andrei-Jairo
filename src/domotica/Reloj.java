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
    public void modificarHora(){
       LocalTime nuevaHora;
        Scanner tec = new Scanner(System.in);
        System.out.println("Que hora nueva sera");
        int hora = tec.nextInt();
        System.out.println("Que minuto nuevo sera");
        int minuto = tec.nextInt();
         System.out.println("Que minuto nuevo sera");
        int segundo = tec.nextInt();
        
        //nuevaHora = new LocalTime(hora,minuto,segundo,0); falta arreglar esto
        // this.hora = nuevaHora;
    
    }

    public Reloj() {
    }
    
}
