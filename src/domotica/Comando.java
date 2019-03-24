/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

/**
 *
 * @author andrei
 */
public enum Comando {
    //Los tipos ENUM tienen dos caracteristicas fundamentales:
    //1. El contructor es privado
    //2. Solo puede instanciarse con un tipo de objeto concreto
    
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    CONSULTAR_HORA(1, "Consultar la hora del sitema"),
    MODIFICAR_HORA(2, "Modifica la hora de la centralita"),
    SUBIR_PUERTA_GARAJE(3, "Subir puerta del garaje"),
    BAJAR_PUERTA_GARAJE(4, "Bajar puerta del garaje"),
    SUBIR_PERSIANAS_SALON(5, "Subir persianas salon"),
    BAJAR_PERSIANAS_SALON(6, "Bajar persianas salon"),
    SUBIR_PERSIANAS_HABITACION(7, "Subir persianas habitación"),
    BAJAR_PERSIANAS_HABITACION(8, "Bajar persianas habitación"),
    ENCENDER_CAMARA_SALON(9, "Encender camara salón"),
    APAGAR_CAMARA_SALON(10, "Apagar camara salón"),
    ENCENDER_LUCES_SALON(11, "Encender luces salon"),
    APAGAR_LUCES_SALON(12, "Apagar luces salon"),
    ENCENDER_LUCES_HABITACION(13, "Encender luces habitación"),
    APAGAR_LUCES_HABITACION(14, "Apagar luces habitacion"),
    CONSULTAR_ESTADO_LUCES_HABITACION(15, "Consultar estado luces del habitación"),
    CONSULTAR_ESTADO_LUCES_SALON(16, "Consultar estado luces del salon"),
    CONSULTAR_ESTADO_GENERAL_VIVIENDA(17, "Consultar estado general vivienda"),
    APAGADO_GENERAL_LUCES(18, "Apagado general de las luces"),
    ENCENDIDO_GENERAL_LUCES(19, "Encendido general de las luces"),
    APAGADO_ECO(20,"Apagado eco"),
    CONSULTAR_FECHA(21,"Consultar fecha"),
    ENCENDER_CAMARA_HABITACION(22, "Encender camara habitación"),
    APAGAR_CAMARA_HABITACION(23, "Apagar camara habitacion");
    
    
    
    
    
    
    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
