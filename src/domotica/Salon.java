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
public class Salon extends Estancia{
    private boolean terraza;
     private Luz luz;
   
    private Puerta puerta;
    private Persiana persianas;

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Persiana getPersianas() {
        return persianas;
    }

    public void setPersianas(Persiana persianas) {
        this.persianas = persianas;
    }

    public Salon(boolean terraza, Luz luz, Puerta puerta, Persiana persianas, int m2) {
        super(m2);
        this.terraza = terraza;
        this.luz = luz;
        this.puerta = puerta;
        this.persianas = persianas;
    }
    
    
}
