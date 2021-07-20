package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("LEAD UNIVERSITY");
            System.out.println("Alumna: Lolita Maldonado");
            System.out.println("Competencia por la Memoria");
            System.out.println("Elija una opcion");
            System.out.println("1. Cantidad inicial de megas");
            System.out.println("2.Reciba una cantidad N de días");
            System.out.println("3. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad inicial de megas");
                    break;
                case 2:
                    System.out.println("Cantidad de dias");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("");
            }
        }


    }
}

