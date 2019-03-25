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
    private Garaje garaje;
    private Salon salon;
    private Habitacion dormitorio;
  

    //Contructor parametrizado
    public Centralita(String identificador, LocalDate fech_ini, Reloj reloj, Garaje garaje, Salon salon,Habitacion dormitorio,Usuario usuario) {
        this.id = identificador;
        this.fech_ini = fech_ini;
        this.reloj = reloj;
      
        this.dormitorio = dormitorio;
        this.salon = salon;
        this.garaje = garaje;
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

    public Centralita(String user, String contrasena) {
        this.usuario = new Usuario(user, contrasena);

    }


    public void ejecutarOrden(Comando comando) {
        switch (comando) {
            case APAGAR_SISTEMA:
                System.out.println("APAGAR_SISTEMA");
                break;
            case CONSULTAR_HORA:
                this.reloj.mostrarHora();
                break;
            case MODIFICAR_HORA:
               this.reloj.modificarHora();
                break;
            case SUBIR_PUERTA_GARAJE:
                this.garaje.getPuertaGaraje().abrirPuerta();
                break;
            case BAJAR_PUERTA_GARAJE:
                 this.garaje.getPuertaGaraje().cerrarPuerta();                
                 break;
            case SUBIR_PERSIANAS_SALON:
               this.salon.getPersianas().subirPeriana();
                break;
            case BAJAR_PERSIANAS_SALON:
                this.salon.getPersianas().bajarPersiana();
                break;
            case SUBIR_PERSIANAS_HABITACION:
                this.dormitorio.getPersianas().subirPeriana();
                break;
            case BAJAR_PERSIANAS_HABITACION:
               this.dormitorio.getPersianas().bajarPersiana();
                break;
            case ENCENDER_CAMARA_SALON:
               if(  this.reloj.getHora().getHour() >= 20 || this.reloj.getHora().getHour() <= 8  ){
               this.salon.getLuz().encenderLuz();
                   System.out.println("Luz encendida");
               
               }
                this.salon.getCamara().encenderCamara();
                System.out.println("Camara encendida");
                break;
            case APAGAR_CAMARA_SALON:
               
              this.salon.getCamara().apagarCamara();
                break;
            case ENCENDER_LUCES_SALON:
                this.salon.getLuz().encenderLuz();
                        
                   break;
            case APAGAR_LUCES_SALON:
                this.salon.getLuz().apagarLuz();
                break;
            case ENCENDER_LUCES_HABITACION:
                this.dormitorio.getLuz().encenderLuz();
                break;
            case APAGAR_LUCES_HABITACION:
               this.dormitorio.getLuz().apagarLuz();
                break;
            case CONSULTAR_ESTADO_LUCES_HABITACION:
               boolean estado =  this.dormitorio.getLuz().isEstado();
               if(estado == true){System.out.println("Las luces estan encendidas");}
               else{System.out.println("Las luces estan apagadas");}
                break;
            case CONSULTAR_ESTADO_LUCES_SALON:
                   boolean estado2 =  this.salon.getLuz().isEstado();
               if(estado2 == true){System.out.println("Las luces estan encendidas");}
               else{System.out.println("Las luces estan apagadas");}           
                break;
            case CONSULTAR_ESTADO_GENERAL_VIVIENDA:
                this.reloj.mostrarHora();
                this.reloj.mostrarFecha();
                if(this.salon.getCamara().isEstado() == true){
                    System.out.println("Camara encendida del salon");
                }else{System.out.println("Camara apagada del salon");}
                 if(this.dormitorio.getCamara().isEstado() == true){
                    System.out.println("Camara encendida del dormitorio");
                }else{System.out.println("Camara apagada del dormitorio");}
                 if(this.salon.getLuz().isEstado() == true){
                     System.out.println("Luz encendida del salon");
                 }else{System.out.println("Luz apagada del salon");}
                  if(this.dormitorio.getLuz().isEstado() == true){
                     System.out.println("Luz encendida del dormitorio");
                 }else{System.out.println("Luz apagada del dormitorio");}
                  if(this.garaje.getPuertaGaraje().isEstado() == true){
                      System.out.println("Puerta del garaje abierta");
                  
                  }else{System.out.println("Puerta del garaje cerrada");}
                  
                break;
            case APAGADO_GENERAL_LUCES:
                this.salon.getLuz().apagarLuz();
             
                this.dormitorio.getLuz().apagarLuz();
                break;
            case ENCENDIDO_GENERAL_LUCES:
                this.salon.getLuz().encenderLuz();
                
                this.dormitorio.getLuz().encenderLuz();
                break;
            case APAGADO_ECO:
                  if(  this.reloj.getHora().getHour() <= 18 || this.reloj.getHora().getHour() >= 8  ){
               this.dormitorio.getLuz().apagarLuz();
               this.salon.getLuz().apagarLuz();
                   System.out.println("Luz apagada");
               
               }
                  break;
            case CONSULTAR_FECHA:
                this.reloj.mostrarFecha();
                        break;
            case ENCENDER_CAMARA_HABITACION:
                if(  this.reloj.getHora().getHour() >= 20 || this.reloj.getHora().getHour() <= 8  ){
               this.dormitorio.getLuz().encenderLuz();
                   System.out.println("Luz encendida");
               
               }
                this.dormitorio.getCamara().encenderCamara();
                System.out.println("Camara encendida");
                break;
            case APAGAR_CAMARA_HABITACION:
               this.dormitorio.getCamara().apagarCamara();
                break;
            default:
                throw new AssertionError();
        }
    }

}
