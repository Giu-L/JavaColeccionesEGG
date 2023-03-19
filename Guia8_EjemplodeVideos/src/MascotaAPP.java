
import MascotaEntidades.Mascota;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giu-L
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        Mascota m1 = new Mascota();
//        m1.apodo= "Samy";
//        m1.nombre=" Samanta ";
//        m1.tipo= " Perro";
//        m1.raza = "Pitbull";
//        m1.edd = 3;
//        m1.color = " Marron y blanca";
//        m1.cola= false;
//   ;        
    m1.pasear(0);
System.out.println(m1.toString());
    }
    
}
