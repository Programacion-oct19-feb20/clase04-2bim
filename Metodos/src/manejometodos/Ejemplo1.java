/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejometodos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String miDia = "";
        System.out.println("Ingrese el número de día: ");
        int valor = entrada.nextInt();

        miDia = obtenerDia(valor);
        System.out.printf("%s\n", miDia);

    }

    public static String obtenerDia(int d) {
        String dia = "";
        switch (d) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Error en día";
        }
        return dia;
    }

}
