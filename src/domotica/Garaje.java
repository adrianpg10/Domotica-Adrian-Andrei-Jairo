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
// la clase garaje es un subtipo o subclase de estancia.Garaje extiende
// (hereda) de estancia
public class Garaje extends Estancia {
    private int capacidadVehiculos;
    private Puerta puerta;
    // Los constructores son los unicos metodos que no se heredan

    public Garaje(int capacidadVehiculos, Puerta puerta, int m2) {
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puerta = puerta;
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

   
    public Garaje(){super();// llama al constructo por defect de la clase padre
    // m2 = 0
    this.capacidadVehiculos = 0;
    this.puerta =new Puerta();
    }
    // ejemplo de acceso a un metedo heredado usando el puntero super que apunta
    // a la clase padre

    @Override
    public String toString() {
        return super.toString()+"\nGaraje{" + "capacidadVehiculos=" + capacidadVehiculos + ", puerta=" + puerta + '}';
    }
    
}
    

