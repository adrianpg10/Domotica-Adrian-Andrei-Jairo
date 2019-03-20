/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import static domotica.Comando.APAGAR_SISTEMA;
import static domotica.Comando.CONSULTAR_ESTADO_GENERAL_VIVIENDA;

/**
 *
 * @author andrei
 */
public class Main {

    public static void main(String[] args) {
        Centralita c = new Centralita("pepe", "rodiguez");
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
