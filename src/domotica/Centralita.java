/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import java.time.LocalDate;

/**
 *
 * @author andrei
 */
public class Centralita {

    private String id;
    private LocalDate fech_ini;
    private Reloj reloj;
    private Usuario usuario;
    private Estancia garaje;
    private Estancia salon;
    private Estancia dormitorio;
    private Usuario user;

    //Contructor parametrizado
    public Centralita(String identificador, LocalDate fech_ini, Reloj reloj, Usuario usuario) {
        this.id = identificador;
        this.fech_ini = fech_ini;
        this.reloj = reloj;
        this.usuario = usuario;
    }

    //Getters y Setters
    public String getIdentificador() {
        return id;
    }

    public void setIdentificador(String identificador) {
        this.id = identificador;
    }

    public LocalDate getFech_ini() {
        return fech_ini;
    }

    public void setFech_ini(LocalDate fech_ini) {
        this.fech_ini = fech_ini;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Centralita(String user, String contrasena) {
        this.usuario = new Usuario(user, contrasena);

    }


    public void ejecutarOrden(Comando comando) {
        switch (comando) {
            case APAGAR_SISTEMA:
                System.out.println("APAGAR_SISTEMA");
                break;
            case CONSULTAR_HORA:
                System.out.println("CONSULTAR_HORA");
                break;
            case MODIFICAR_HORA:
                System.out.println("MODIFICAR_HORA");
                break;
            case SUBIR_PUERTA_GARAJE:
                System.out.println("SUBIR_PUERTA_GARAJE");            
                break;
            case BAJAR_PUERTA_GARAJE:
                System.out.println("BAJAR_PUERTA_GARAJE");            
                break;
            case SUBIR_PERSIANAS_SALON:
                System.out.println("SUBIR_PERSIANAS_SALON");            
                break;
            case BAJAR_PERSIANAS_SALON:
                System.out.println("BAJAR_PERSIANAS_SALON");            
                break;
            case SUBIR_PERSIANAS_DORMITORIO:
                System.out.println("SUBIR_PERSIANAS_DORMITORIO");            
                break;
            case BAJAR_PERSIANAS_DORMITORIO:
                System.out.println("BAJAR_PERSIANAS_DORMITORIO");            
                break;
            case ENCENDER_CAMARA:
                System.out.println("ENCENDER_CAMARA");            
                break;
            case APAGAR_CAMARA:
                System.out.println("APAGAR_CAMARA");            
                break;
            case ENCENDER_LUCES_SALON:
                System.out.println("ENCENDER_LUCES_SALON");            
                break;
            case APAGAR_LUCES_SALON:
                System.out.println("APAGAR_LUCES_SALON");            
                break;
            case ENCENDER_LUCES_DORMITORIO:
                System.out.println("ENCENDER_LUCES_DORMITORIO");            
                break;
            case APAGAR_LUCES_DORMITORIO:
                System.out.println("APAGAR_LUCES_DORMITORIO");            
                break;
            case CONSULTAR_ESTADO_LUCES_DORMITORIO:
                System.out.println("CONSULTAR_ESTADO_LUCES_DORMITORIO");            
                break;
            case CONSULTAR_ESTADO_LUCES_SALON:
                System.out.println("CONSULTAR_ESTADO_LUCES_SALON");            
                break;
            case CONSULTAR_ESTADO_GENERAL_VIVIENDA:
                System.out.println("CONSULTAR_ESTADO_GENERAL_VIVIENDA");            
                break;
            default:
                throw new AssertionError();
        }
    }

}
