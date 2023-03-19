/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Peliculas {
    private ArrayList<Peliculas> cine;
    private String titulo;
    private String director;
    private int hora;
    private int seg;
    private int min;

    public Peliculas(String titulo, String director, int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg= seg;
        this.director= director;
        this.titulo = titulo;
    }

    Peliculas() {
    }

    public ArrayList<Peliculas> getCine() {
        return cine;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getHora() {
        return hora;
    }

    public int getSeg() {
        return seg;
    }

    public int getMin() {
        return min;
    }

    /**
     *
     * @return
     */
    public Peliculas pelis(Peliculas Peliculas){
        Scanner lee = new Scanner(System.in);
        ArrayList<Peliculas> cines = new ArrayList<>();

        
        boolean continuar = true;

        while(continuar){

            System.out.println("Ingrese titulo de la pelicula: ");
            String tit = lee.nextLine();


            System.out.println("Ingrese el nombre del director: ");
            String dir = lee.nextLine();


            System.out.println("Ingrese la cantidad de horas que dura la pelicula: ");
            int horario =lee.nextInt();


            System.out.println("Ingrese la cantidad de minutos wue dura la pelicula ");
            int minutos = lee.nextInt();


            System.out.println("Ingrese la cantidad de segundos que dura la pelicula: ");
            int segundos = lee.nextInt();

            cines.add(new Peliculas(tit, dir, horario, minutos, segundos));

            System.out.println("Desea ingresar otra pelicula? ");
            lee.nextLine(); // consume la línea en blanco
            String resp = lee.nextLine();

            if(resp.equalsIgnoreCase("no")){
                continuar = false;
                break;
            }
        }
        

        System.out.println("Lista de peliculas");
        cines.forEach((pelicula) -> {
            System.out.println(pelicula.getTitulo() + ", dirigida por " + pelicula.getDirector() +
                    ", dura " + pelicula.getHora() + " : " + pelicula.getMin() + " : " +
                    pelicula.getSeg() );
        }); // pelicula con mayor hora
        return Peliculas;
            
           
        }
    }


