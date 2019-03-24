/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author jairo
 */
public class Camara {

    private boolean estado;
    private String ip;

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    public Camara() {

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void encenderCamara() {
        if (estado == false) {
            this.estado = true;
        } else {
            System.out.println("Ya esta encendida");
        }
    }

    public void apagarCamara() {
        if (this.estado == true) {
            this.estado = false;
        } else {
            System.out.println("Ya esta apagada");
        }
    }

}
