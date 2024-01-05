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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String cedula;
        int num;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese un numero entre 1 y 2");
        num = entrada.nextInt();

        if (num == 1) {
            calcularValorLuz(nombre, cedula);
        } else if (num == 2) {
            calcularPredio(nombre, cedula);
        }
    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String mensaje;
        double valorkw;
        int numkw;
        double valortotal;
        System.out.println("Ingrese el valor del kilowatio");
        valorkw = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios del mes");
        numkw = entrada.nextInt();
        valortotal = valorkw * numkw;

        mensaje = String.format("Cliente: %s con cedula %s debe cancelar "
                + "el valor de $%.2f", a, b, valortotal);
        System.out.println(mensaje);
    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valorI;
        double predio;
        String mensaje;
        
        System.out.println("Ingrese el valor de su inmueble");
        valorI = entrada.nextDouble();
        predio = valorI * 0.02;
        
        mensaje = String.format("Cliente %s con cédula %s tiene un bien "
                + "inmueble valorado en %.2f y tiene que pagar de "
                + "predio $ %.2f.", a,b,valorI,predio);
        System.out.println(mensaje);
    }
}
