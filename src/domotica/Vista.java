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
        System.out.println("7.- Subir persianas habitacion");
        System.out.println("8.- Bajar persianas habitacion");
        System.out.println("9.- Encender camara salón");
        System.out.println("10.- Apagar camara salón");
        System.out.println("11.- Encender luces salon");
        System.out.println("12.- Apagar luces salon");
        System.out.println("13.- Encender luces habitacion");
        System.out.println("14.- Apagar luces habitacion");
        System.out.println("15.- Consultar estado luces del habitacion");
        System.out.println("16.- Consultar estado luces del salon");
        System.out.println("17.- Consultar estado general vivienda");
        System.out.println("18.- Apagado general de las luces");
        System.out.println("19.- Encendido general de las luces");
        System.out.println("20.- Apagado eco");
        System.out.println("21.- Consultar fecha");
        System.out.println("22.- Encender camara habitación");
        System.out.println("23.- Apagar camara habitacion");

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
                return Comando.SUBIR_PERSIANAS_HABITACION;
            case 8:
                return Comando.BAJAR_PERSIANAS_HABITACION;
            case 9:
                return Comando.ENCENDER_CAMARA_SALON;
            case 10:
                return Comando.APAGAR_CAMARA_SALON;
            case 11:
                return Comando.ENCENDER_LUCES_SALON;
            case 12:
                return Comando.APAGAR_LUCES_SALON;
            case 13:
                return Comando.ENCENDER_LUCES_HABITACION;
            case 14:
                return Comando.APAGAR_LUCES_HABITACION;
            case 15:
                return Comando.CONSULTAR_ESTADO_LUCES_HABITACION;
            case 16:
                return Comando.CONSULTAR_ESTADO_LUCES_SALON;
            case 17:
                return Comando.CONSULTAR_ESTADO_GENERAL_VIVIENDA;
            case 18:
                return Comando.APAGADO_GENERAL_LUCES;
            case 19:
                return Comando.ENCENDIDO_GENERAL_LUCES; 
            case 20:
                return Comando.APAGADO_ECO;
            case 21:
                return Comando.CONSULTAR_FECHA;
            case 22:
                return Comando.ENCENDER_CAMARA_HABITACION;
            case 23:
                return Comando.APAGAR_CAMARA_HABITACION;
            default:
                throw new AssertionError();

        }

    }

}
