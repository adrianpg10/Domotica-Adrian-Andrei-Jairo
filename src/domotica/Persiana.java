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
public class Persiana {
    private boolean estado;
    private int largo;
    private int ancho;

    public Persiana(boolean estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public Persiana(){
        this.estado = true;
        this.largo = 10;
        this.ancho = 10;
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void subirPeriana(){
        if (estado == false) {
            this.estado = true;
        } else {
            System.out.println("Ya estan subidas");
        }
    }
    
    public void bajarPersiana(){
        if (estado == true) {
            this.estado = false;
        } else {
            System.out.println("Ya estan bajadas");
        }
    }
}
