package com.empresa.teoria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca=new Biblioteca();
        Scanner sc=new Scanner(System.in);

        //crear fondo de biblioteca
        biblioteca.agregarLibro(new Libro("quijote","cervantes",false));
        biblioteca.agregarLibro(new Libro("la colmena","cela",false));
        biblioteca.agregarLibro(new Libro("el manuscrito carmesí","gala",false));

        //menu de opciones
        int opcion;
        do{
            System.out.println("Menú de biblioteca \n");
            System.out.println("1. prestar libro \n");
            System.out.println("2 devolver libro \n");
            System.out.println("3. buscar libro \n");
            System.out.println("4. Salir \n");
            opcion=sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    biblioteca.prestarLibro(new Libro("rimas y leyendas","becquer",false),new Usuario("juan",14));
                    break;

                case 2:
                    biblioteca.devolverLibro(new Libro("la colmena","cela",false));
                    break;

                default:
                    System.out.println("no lo encuentro");
            }
        }
        while(opcion!=4);
        sc.close();
    }
}
