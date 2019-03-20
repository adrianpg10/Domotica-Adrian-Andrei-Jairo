/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.util.Scanner;

/**
 *
 * @author Chiri
 */
public class Vista {

    private static Scanner teclado = new Scanner(System.in);

    public static boolean login(Centralita c) {
        Scanner teclado = new Scanner(System.in);

        boolean comparar = false;
        int contador = 0;
        while (comparar = false || contador <= 5) {
            System.out.println("Dime usuario");
            String usuario = teclado.nextLine();
            System.out.println("Dime contrasenia");
            String contrasenia = teclado.nextLine();
            Usuario user = new Usuario(usuario, contrasenia);

            if (c.getUsuario().equals(user)) {
                System.out.println("Correcto");
                comparar = true;
                break;
            } else {
                System.out.println("Error en el login ");
                contador++;

            }
        }
        return comparar;

    }

    public static Comando menu() {
        System.out.println("Bienvenido a la centralita");

        System.out.println("----------------------------");
        System.out.println("-------¿Que quieres hacer?-------");
        System.out.println("0.- Apagar sistema");
        System.out.println("1.- Consultar hora");
        System.out.println("2.- Modifica la hora de la centralita");
        System.out.println("3.- Subir puerta del garaje");
        System.out.println("4.- Bajar puerta del garaje");
        System.out.println("5.- Subir persianas salon");
        System.out.println("6.- Bajar persianas salon");
        System.out.println("7.- Subir persianas dormitorio");
        System.out.println("8.- Bajar persianas dormitorio");
        System.out.println("9.- Encender camara");
        System.out.println("10.- Apagar camara");
        System.out.println("11.- Encender luces salon");
        System.out.println("12.- Apagar luces salon");
        System.out.println("13.- Encender luces dormitorio");
        System.out.println("14.- Apagar luces dormitorio");
        System.out.println("15.- Consultar estado luces del dormitorio");
        System.out.println("16.- Consultar estado luces del salon");
        System.out.println("17.- Consultar estado general vivienda");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 0:
                return Comando.APAGAR_SISTEMA;
            case 1:
                return Comando.CONSULTAR_HORA;
            case 2:
                return Comando.MODIFICAR_HORA;
            case 3:
                return Comando.SUBIR_PUERTA_GARAJE;
            case 4:
                return Comando.BAJAR_PUERTA_GARAJE;
            case 5:
                return Comando.SUBIR_PERSIANAS_SALON;
            case 6:
                return Comando.BAJAR_PERSIANAS_SALON;
            case 7:
                return Comando.SUBIR_PERSIANAS_DORMITORIO;
            case 8:
                return Comando.BAJAR_PERSIANAS_DORMITORIO;
            case 9:
                return Comando.ENCENDER_CAMARA;
            case 10:
                return Comando.APAGAR_CAMARA;
            case 11:
                return Comando.ENCENDER_LUCES_SALON;
            case 12:
                return Comando.APAGAR_LUCES_SALON;
            case 13:
                return Comando.ENCENDER_LUCES_DORMITORIO;
            case 14:
                return Comando.APAGAR_LUCES_DORMITORIO;
            case 15:
                return Comando.CONSULTAR_ESTADO_LUCES_DORMITORIO;
            case 16:
                return Comando.CONSULTAR_ESTADO_LUCES_SALON;
            case 17:
                return Comando.CONSULTAR_ESTADO_GENERAL_VIVIENDA;
            default:
                throw new AssertionError();

        }

    }

}
