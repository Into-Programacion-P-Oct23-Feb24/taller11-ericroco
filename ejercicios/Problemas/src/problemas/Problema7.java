/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] mensaje;
        mensaje = obtenerCadena();
        System.out.println("Valores");
        for (int i = 0; i < mensaje.length; i++) {
            System.out.println(mensaje[i]);

        }
        System.out.println("Valores con 4 o 5 caracteres");
        obtenervalores(mensaje);
    }

    public static String[] obtenerCadena() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        System.out.println("Ingrese el numero de datos que desea");
        num = entrada.nextInt();
        String[] mensaje = new String[num];
        entrada.nextLine();
        for (int i = 0; i < mensaje.length; i++) {
            System.out.println("Ingrese el dato que desee");
            mensaje[i] = entrada.nextLine();
        }
        return mensaje;
    }

    public static void obtenervalores(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].length() == 4 || valores[i].length() == 5) {
                System.out.println(valores[i]);
            }
        }
    }
}
