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

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }
    
    
    
}
