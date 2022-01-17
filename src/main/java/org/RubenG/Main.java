package org.RubenG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Juego[] juegos = new Juego[5];
        for (int i = 0; i < juegos.length; i++) {
            juegos[i] = new CreadorJuego().createRandom();
        }
        System.out.println("Los juegos aleatorios son los siguientes:");

        for (int i = 0; i < juegos.length; i++) {
            System.out.println(i + ": " + juegos[i]);
        }

        System.out.println("Juegos manuales");
        Juego[] juegos2 = new Juego[3];
        for (int i = 0; i < juegos2.length; i++) {
            Scanner sc = new Scanner(System.in);
            boolean ok = true;
            juegos2[i] = new Juego();
            System.out.println("Dime el titulo del " + (i+1) + "º juego: ");
            juegos2[i].setTitulo(sc.nextLine());
            System.out.println("Escriba la plataforma del juego: ");
            do {
                try {
                    juegos2[i].setPlataforma(sc.nextLine());
                    ok = false;
                }catch (Exception e) {
                    System.err.println("No es una plataforma válida, escribe de nuevo la plataforma: ");
                }
            }while(ok);
            System.out.println("¿Cual es el precio del juego?: ");
            do {
                ok = true;
                try {
                    juegos2[i].setPrecio(sc.nextFloat());
                    ok = false;
                }catch (Exception e) {
                    System.err.println("No es un precio válido, escribe de nuevo el precio: ");
                    sc.next();
                }
            }while(ok);
            }

        for (Juego juego : juegos2) {
            System.out.println(juego);

        }

        }

}

