/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package entornos.calculadoraed;

import java.util.Scanner;

/**
 *
 * @author AlvaroD
 */
public class CalculadoraED {
    
    static Scanner scanner = new Scanner(System.in);
    static int opcion = -1; //opción del menú
    static int numero1 = 0, numero2 = 0; //Variables de entrada

    public static void main(String[] args) {
        System.out.println("Hola, bienvenido!");
        while (opcion != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n" + ""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");

                System.out.println("Selecciona una opción de 0 a 4");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> {
                        pideNumeros();
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    }
                    case 2 -> {
                        pideNumeros();
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    }
                    case 3 -> {
                        pideNumeros();
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    }
                    case 4 -> {
                        pideNumeros();
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no disponible");
                }

                System.out.println("\n");

            } catch (NumberFormatException e) {
                System.out.println("Error!");
            }
        }

    }

    //Método para recoger las variables de entrada
    public static void pideNumeros() {
        System.out.println("Introduce el primer número:");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce el segundo número:");
        numero2 = Integer.parseInt(scanner.nextLine());

    }
}

