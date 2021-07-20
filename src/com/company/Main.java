package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double megas;
        double dias;
        double consumo;


        System.out.println("LEAD UNIVERSITY");
        System.out.println("Profesor: Mario Aguero");
        System.out.println("Alumna: Lolita Maldonado");
        System.out.println("Competencia por la Memoria");
        System.out.println("Introduce Cantidad inicial de megas:");
        megas = sc.nextDouble();
        System.out.println("Introduce Cantidad de dias :");
        dias = sc.nextDouble();
        System.out.println("Megas disponibles :");



        int i = 31; {
            if (megas > 28000) {
                consumo = (megas * 1.31 - 7000);
                System.out.println("El consumo diario es:" + consumo);
            } else {
                consumo = (megas * 1.024 - 7000);
                System.out.println("El consumo diario es:" + consumo);

            }


        }
    }

}

