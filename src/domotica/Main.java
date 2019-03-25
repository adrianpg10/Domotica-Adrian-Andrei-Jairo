/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import static domotica.Comando.APAGAR_SISTEMA;
import static domotica.Comando.CONSULTAR_ESTADO_GENERAL_VIVIENDA;
import java.time.LocalDate;

/**
 *
 * @author andrei
 */
public class Main {

    public static void main(String[] args) {
        //   public Centralita(String identificador, LocalDate fech_ini, Reloj reloj, 
        //Garaje garaje, Salon salon,Habitacion dormitorio,Usuario user)
        String id = "1234";
        LocalDate lc =  LocalDate.now();
        Reloj reloj = new Reloj();
        Garaje garaje = new Garaje();
        Salon salon = new Salon();
        Habitacion dorm = new Habitacion();
        String us = "jc";
        String contra = "vico";
        Usuario user = new Usuario(us,contra);
        
        Centralita c = new Centralita(id,lc,reloj,garaje,salon,dorm,user);
        boolean login = Vista.login(c);
        if (login == false) {
            System.out.println("Has pasado todos los intentos de login se apagara el sistema");
        } else {
            Comando coman = CONSULTAR_ESTADO_GENERAL_VIVIENDA;
            while (coman != APAGAR_SISTEMA) {
                coman = Vista.menu();
                c.ejecutarOrden(coman);
            }

        }

    }
}
