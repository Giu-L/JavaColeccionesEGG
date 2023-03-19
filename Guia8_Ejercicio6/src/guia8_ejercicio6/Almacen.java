/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Almacen {
    private String productos;
    private int precios;
    private Object getProductos;
    public Almacen(){
       
    }
    
    public Almacen(String productos, int precios){   
        this.productos = productos;
        this.precios = precios;
    }
    
    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }
    
   Scanner leo = new Scanner(System.in).useDelimiter("\n");
       HashMap<String, Integer> produ = new HashMap();  
         String lista = "";
         
    public HashMap<String, Integer> gondolas(){
        boolean seguir = true;
            while(seguir){
                 System.out.println("Ingrse el producto: ");
                    String nombre = leo.nextLine();
        
                     System.out.println("Ingrese el valor: ");
                    int precio= leo.nextInt();
        
                 produ.put(nombre, precio);
     
               System.out.println("Desea ingresar mas productos? ");
                leo.nextLine();
                String op = leo.nextLine();
                if(op.equalsIgnoreCase("no")){ 
                seguir = false;
                     break;
            }
            
                    }
             mostrarInventario();
      return produ;
    }
    
    public  void cambiarPrecio(){
        System.out.println("Ingrese el producto a modificar: ");
         String nombre = leo.nextLine();
        
        if(produ.containsKey(nombre)){
            System.out.println("Ingrese el nuevo precio: ");
            int precio = leo.nextInt();
           
            produ.put(nombre, precio);
            System.out.println("precio modificado exitosamente");
        }else{
            System.out.println("El producto no se encontro.");
        }  
        mostrarInventario();
     }
     
    public  void eliminarProducto(){
        System.out.println("Ingrse el 1"
                + "prodcuto a eliminar: ");
            String nombre = leo.nextLine();
        
            if(produ.containsKey(nombre)){
                produ.remove(nombre);
                System.out.println("Prodcuto eliminado");
                }else{
            System.out.println("No se encontro el prodcuto");
        }
             mostrarInventario();
           
            }
   public void mostrarInventario() {
        System.out.println("========== Inventario de la tienda ==========");
          for (String nombre : produ.keySet()) {
            double precio = produ.get(nombre);
            System.out.printf("%s - %.2f%n", nombre, precio);
        }
        System.out.println("=============================================");
    }
    
         
        }
            
    

    

            
    



