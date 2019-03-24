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
public class Luz {
    private boolean estado;
    private double consumo;

    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }
    
    public Luz(){
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public void encenderLuz(){
        if (estado == false) {
            this.estado = true;
        } else {
            System.out.println("Ya esta encendida");
        }
    }
    
    public void apagarLuz(){
        if (estado == true) {
            this.estado = false;
        } else {
            System.out.println("Ya esta apagada");
        }
    }
    
}
