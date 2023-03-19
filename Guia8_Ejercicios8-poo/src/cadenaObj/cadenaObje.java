/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//8-  realizar una clase llamada Cadena que tenga como atrributo una frase ( de tipoo  de String) y su longitud. en el main se creara el objeto y se kle pedira al usuario que ingrese 
//una frase que pueda ser una palabra o varias oalabras separadas por un espacio en blanco a traves de los metodos set, 
//se guardara la frase y lka longitud de manera auromatica segun la longitud de la fease ingresada. debera ademas implementar los siguientes metodo:

package cadenaObj;

/**
 *
 * @author Giu-L
 */
public class cadenaObje {
    public String frase;
    public int longitud;
    
 public cadenaObje(){
     this.frase = " ";
     this.longitud = 0; 
 }
 public void setFrase(String frase){
     this.frase = frase;
     this.longitud = frase.length();
 }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

   
}