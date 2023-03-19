/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio3;
import guia8_ejercicio3.alumnos.servicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    servicioAlumno servicio = new servicioAlumno();
     Scanner leer = new Scanner(System.in);
     boolean continuar = true;
     
     while(continuar){
         servicio.crearAlumno();
         System.out.println("Desea ingresr otro alumno? ");
         String resp = leer.nextLine();
         if(!resp.equalsIgnoreCase("si")){
             continuar = false;
         }
         
     }
     servicio.notaFinal();
    }
   
 
    
}
