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

    public int compararUsuario() {
        Usuario user = Vista.login();
        boolean zz = false;
        int contador = 0;
        while (zz = false || contador <= 5) {
            if (user.equals(usuario)) {
                System.out.println("Correcto");
                zz = true;
            } else {
                System.out.println("Error vuelve a poner los datos");
                contador++;
                user = Vista.login();

            }
        }
        if (contador >= 5) {
            System.out.println(" Se han acabado las opciones de login");
        }
        return contador;
    }

    public Centralita(String user, String contrasena) {
        this.usuario = new Usuario(user, contrasena);

    }


    public void ejecutarOrden(Comando comando) {

    }

}
