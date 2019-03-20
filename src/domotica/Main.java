/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

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
            c.ejecutarOrden(Vista.menu());

        }
    
    }
}
