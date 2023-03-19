/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Giu-L
 */
//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.



/**
 * en este punto se crean los atributos nombre y ya se crea un a listra intreger, que se refiere a una lista de enteros
 * se usa el get para utilizar los valores de la propiedad.
 * @author Giu-L
 */
public class alumnos {
     private String nombre;
     private List<Integer> notas;
     
   public alumnos(String nombre, List<Integer> notas){
       this.nombre = nombre;
       this.notas = notas;
   }  

    public String getNombre() {
        return nombre;
    }
//  TENEMOS LA LISTA INT DE ENTEROS DE NOTAS
    public List<Integer> getNotas() {
        return notas;
    }
    
    public double calcularNota(){
        int sumaNota = 0;{
     //NOTAS VA A RECORRER LA LISTA DE NOTAS Y VAB SUMAR LAS NOTAS A LA NUEVA LISTA NOTA   
        for (int nota : notas) {
            sumaNota += nota;
    }
        // SIZE MUTRA LA CANTIDAD DE ELEMENTOS QUE ALACENA LA LISTA EN ENTEROS
        return(double) sumaNota / notas.size();
    }
    }
   // SE CREA UNA CLASE PARA AGREGAR ALUMNOS A LA LISTA
    public static class servicioAlumno{
        private final List<alumnos> listaAlumnos;
      
    public servicioAlumno(){
            listaAlumnos = new ArrayList<>();
            }

  
    
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no. 

public  List<Integer> crearAlumno(){
    Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese nombre del alumno: ");
            String nom = lee.nextLine();
            // SE CREA UNA NUEVA LISTA DE NOTAS DONDE SE VAN A INGRESAR LAS NOTAS EL NUEVO ALUMNO 
            List<Integer> notas = new ArrayList<>();
    for (int i = 0; i <= 2; i++) {  
        System.out.println("Ingrese la nota " + i + " del alumno");
            int num = lee.nextInt();
              notas.add(num);
    }
    // SE UNENN AMBAS LISTAS  NOMBRES Y ALUMNOS
      alumnos alumno = new alumnos(nom, notas);
      listaAlumnos.add(alumno);
      System.out.println("Alumno crado");
           return notas;
    }
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    public void notaFinal(){
        Scanner leert = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para calcular la nota final: ");
        String nombre = leert.nextLine();
        for (alumnos alumno : listaAlumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                double notaFinal = alumno.calcularNota();
                System.out.println("La nota final del alumno " + nombre + " es " + notaFinal);
                return;
                
            }
           
            System.out.println("El alumno no se encuentra");
    }
}
    }
}
