/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotaEntidades;

/**
 *
 * @author Giu-L
 */
public class Mascota {
    public String nombre;
    public String apodo;
    public String tipo;
    public String color; 
    public String raza;
    public int edd;
    public boolean cola;
    private int energia; 
    // CONSTRUCTOR, publico por si busco utilizarlo fuera de la clase facil
   
    public Mascota(){
       
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre= nombre;
        this.apodo = apodo;
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("pajaro")|| tipo.equals("Elefantes")){
            this.tipo = tipo;
        }
            this.energia =1000;
        
    }
    //(parametros) ESTOS TAMBIEN  SON CONSTRUCTORES
    public Mascota(String nombre, String apodo,String tipo,String color,String raza,int edd, boolean cola){
      //Se asigna o designa, se le inyecta a la clase atributos, THIS. ALGO HACE REFERENCIA AL ATRIBUTO// CLASE 
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edd =edd;
        this.cola = cola;
        
    }
    
 // LOS SETTERS: SE USAN PARA ASIGNARLE UN VALOR AL CONSTRUCOTR FUERA DE LA CLASE.
    // LOS GETTERS: SE USASN PARA MOSTRAR/ ACCEDER A LOS SETERS Y MOSTRAR EL VALOR ASIGNADO EN EL SETTERS 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdd() {
        return edd;
    }

    public void setEdd(int edd) {
        this.edd = edd;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    //METODO DE OPERACION por cada animal credo se resta la energia
   public int pasear(int energiaRestante){
       energia = energia - energiaRestante;
        return energia ;
   }
// toString     SIRVE PARA IMPRIMIR POR PANTALLA LOS CONSTRUCTORES
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", edd=" + edd + ", cola=" + cola + ", energia=" + energia + '}';
    }
   
  
   
}