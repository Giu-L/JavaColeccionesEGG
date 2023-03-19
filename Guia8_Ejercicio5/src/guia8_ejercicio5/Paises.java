/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
package guia8_ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Paises {
 
   
    public Paises() {
    }

    public void pais() {
        Scanner leo = new Scanner(System.in);
        boolean seguir = true;
        HashSet<String> paises = new HashSet<>();
        while (seguir) {
            System.out.println("Ingrese el pais");
            String nom = leo.nextLine();
            paises.add(nom);
            System.out.println("Desea ingresar otro pais?");
            String resp = leo.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                seguir = false;
                break;
            }
        }

        // Imprime los paises ordenados alfabéticamente
        ArrayList<String> lista = new ArrayList<>(paises);
        Collections.sort(lista);
        System.out.println(lista);

        // Pide al usuario que ingrese el país a eliminar
        System.out.println("Ingrese el país a eliminar: ");
        String paisBuscar = leo.next();

        // Elimina el país de la lista si está presente
        Iterator<String> iter = lista.iterator();
        boolean encontrado = false;
        while (iter.hasNext()) {
            String eliminar = iter.next();
            if (eliminar.equals(paisBuscar)) {
                iter.remove();
                encontrado = true;
            }
        }

        // Imprime la lista de paises actualizada
        if (encontrado) {
            System.out.println(lista);
        } else {
            System.out.println("El país ingresado no se encontró en la lista.");
        }
    }
}

        
      
   
