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
public class Puerta {
    private boolean estado;
    private int retardo;
    
    // si no pongo constructor crea uno java por defect
       
    public Puerta() {
        this.estado = false;
        this.retardo = 2;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }
    
    public void abrirPuerta(){
        if (estado == false) {
            this.estado = true;
        } else {
            System.out.println("Ya esta abierta");
        }
    }
    
    public void cerrarPuerta(){
        if (estado == true) {
            this.estado = false;
        } else {
            System.out.println("Ya esta cerrada");
        }
    }
    
}
