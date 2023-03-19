
import cadenaSer.cadenaServ;
import java.util.Scanner;
import cadenaObj.cadenaObje;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giu-L
 */
public class cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadenaServ nuevaCadena = new cadenaServ();
        cadenaObje nueva= new cadenaObje();
        Scanner lee = new Scanner(System.in);
        
        System.out.println("INGRESE UNA FRASE: ");
        String frase = lee.nextLine();
        nueva.setFrase(frase);
        
        System.out.println("IGRESE RASE PARA MOSTRAR VOCALES " + nueva.getLongitud());
        String fraseIn;
        fraseIn = lee.nextLine();
        nuevaCadena.mostrarVocal();
        
        System.out.println("INGRESE UNA FRASE PARA UNIR");
        String otrafrase = lee.nextLine();
        nuevaCadena.unirFrase(otrafrase);
     
        System.out.println("INGRESE UNA FRASE PARA SABER CUANTAS VECES SE REPITE UNA LETRA  ");
        String fras;
        fras = lee.nextLine();
        nuevaCadena.vecesRepetido(fras);
        
        System.out.println("INGRESE UNA FRASE CONTIENE ");
        String fra = lee.nextLine();
        nuevaCadena.contiene(fra);
      
        
        
    }

   
    
}
