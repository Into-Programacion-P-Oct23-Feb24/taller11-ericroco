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

        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Ingrese la nota en la posición [%d]"
                    ,i);
            notas[i] = entrada.nextDouble();
        }
        
        System.out
    }

}
