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
public class Habitacion extends Estancia{

    private Luz luz;
    private Orientacion orientacion;
    private Puerta puerta;
    private Persiana persianas;
    private Camara camara;

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public Luz getLuz() {
        return luz;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
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

    public Habitacion(Luz luz, Orientacion orientacion, Puerta puerta, Persiana persianas, int m2, Camara camara) {
        super(m2);
        this.luz = luz;
        this.orientacion = orientacion;
        this.puerta = puerta;
        this.persianas = persianas;
        this.camara = camara;
    }
    
    
    

}
