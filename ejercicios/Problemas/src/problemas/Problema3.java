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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String datos = "";
        String mensaje = "";
        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Ingrese la nota en la posición [%d]\n",
                    i);
            notas[i] = entrada.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            datos = String.format("%s%.2f, ", datos, notas[i]);
        }
        String promedioC = obtenerPromedioC(notas);
        mensaje = String.format("%sEl promedio de las notas %s es %s",
                mensaje, datos, promedioC);
        System.out.println(mensaje);
    }

    public static String obtenerPromedioC(double[] calif) {
        double suma = 0;
        double promedio = 0;
        String promedioC = "";
        for (int i = 0; i < calif.length; i++) {
            suma = suma + calif[i];
        }
        promedio = suma / calif.length;

        if (promedio >= 0 && promedio <= 5) {
            promedioC = "Regular";
        } else if (promedio >= 5.1 && promedio <= 8) {
            promedioC = "Bueno";
        } else if (promedio >= 8.1 && promedio <= 9) {
            promedioC = "Muy Bueno";
        } else if (promedio >= 9.1 && promedio <= 10) {
            promedioC = "Sobresaliente";
        }
        return promedioC;
    }
}
