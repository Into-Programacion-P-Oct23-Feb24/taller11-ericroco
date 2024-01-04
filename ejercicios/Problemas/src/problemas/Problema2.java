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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num;
        System.out.println("Ingrese un numero del 1 al 3");
        num = entrada.nextInt();

        switch (num) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Fuera de rango");
                break;
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double area;
        double lado;
        System.out.println("Ingrese el valor de un lado");
        lado = entrada.nextDouble();
        area = Math.pow(lado, 4);
        System.out.printf("El area del cuadrado es %.2f", area);

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double area;
        double base;
        double altura;
        System.out.println("Ingrese la base de su triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura de su triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del triangulo es %.2f", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double area;
        double base;
        double altura;
        System.out.println("Ingrese la base de su rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura de su rectangulo");
        altura = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("El area del rectangulo es %.2f", area);
    }
}
