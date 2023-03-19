/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Guia8_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lei = new Scanner(System.in);
        Almacen almacen = new Almacen();
       boolean salir = false;
        while(!salir){
         System.out.println("Bienvenido a su nueva tienda" + "\n" + "Elije una opcion: ");
         System.out.println("1 - CREAR INVENTARIO");
         System.out.println("2 - MODIFICAR PRECIO");
         System.out.println("3 - ELIMINAR PRODUCTO");
         System.out.println("4 - SALIR");
         
         int op = lei.nextInt();
     
     switch(op){
         case 1 :
             almacen.gondolas();
             break;
         case 2: 
             almacen.cambiarPrecio();
             break;
         case 3 :
             almacen.eliminarProducto();
             break;
             
         case 4: 
             salir = true;
     }
        
    }
    
    }
}
