/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//a) metodo  mostrarVocal(), debera contabilizar la cantidad de vocales que tiene frase ingresada.
//b) metodo invertirFrase(), debera invertir la  frase y mostratla por pantalla. por ejemplo entrada: " casa blamnca".
//c) metodo vecesRepetido(String letra), recibira un caracter ingresado por el usuario
//d) entrada: frase " algpo", salida 'a' se repite 1 vez
//f) metodo unirFRase(String frase ) debera unir frase contenida en la clase cadena con una nueva frase ingresada por el usuario y mostrar la ffrase resultante.
//g) metodo remplazar(String letra) debera reemplazar todas las letras " a" que se encuentren en la frase, por algun otro caracter seleccionado por el usuario y mostrar la frase resultante.
//A
package cadenaSer;

import cadenaObj.cadenaObje;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 *
 * @author Giu-L
 */
public class cadenaServ {
    cadenaObje nuevaFrase = new cadenaObje();
    
   public void mostrarVocal(){
    
        int contador= 0;
        for (int i = 0; i < nuevaFrase.longitud; i++) {
            char letra = Character.toLowerCase(nuevaFrase.frase.charAt(i));
          if( letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
             contador++;
            
          }  
            System.out.println("la frse tierne " + contador+ " vocales" );
       }
    }
   public void  invertirFrase(){
       
       StringBuilder sb = new StringBuilder(nuevaFrase.frase);
       String fraseIn = sb.reverse().toString();
       System.out.println("Frase invertida" + fraseIn);
   } 
   public void vecesRepetido(String letra){
       int cont = 0;
       for (int i = 0; i < nuevaFrase.frase.length(); i++) {
           
           if(String.valueOf(nuevaFrase.frase.charAt(i)).equals("a")){
               cont++;
           }
           System.out.println("la letra A se repite " + cont);
       }
       
   }
   public void unirFrase(String otrafrase){
       String fra = nuevaFrase.frase + " " + otrafrase;
       System.out.println("Frase resultantte" +  fra);
       
   }
   public boolean contiene(String letra){
       return nuevaFrase.frase.contains(letra);
   }
   public void compararLon(String otrafrase){
       int otraLon = otrafrase.length();
       if(nuevaFrase.longitud > otraLon){
           System.out.println("la frase origienal es mas larga" + otraLon);
           
       }else if(nuevaFrase.longitud < otraLon){
           System.out.println("Frase corta" + otraLon);
           
       }
       
   }
}
