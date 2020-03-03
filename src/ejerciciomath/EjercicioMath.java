/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomath;

import java.util.Scanner;

/**
 *
 * @author KEVIN MIZA
 */
public class EjercicioMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a operar");
        double num1=  sc.nextDouble();
        System.out.println("Ingrese el segundo numero a operar");
        double num2=  sc.nextDouble();
        double resta = num1-num2;
        System.out.println("La resta de los dos numeros es : "+resta);

       double resuly = Math.sqrt(Math.abs(resta));
        System.out.println("La raiz cuadrada de "+resta+"es : " +resuly);
        double max = Math.max(num1, num2);
        System.out.println("El valor maximo entre los dos valores ingresados es: "+max);
        
        double pot = Math.pow(num1, num2);
        System.out.println("La potencia del primer numero elevado al segundo es "+pot);
        
        System.out.println("Ingrese el radio de su circulo");
        double radio = sc.nextDouble();

        double pir = Math.pow(radio,2);
        double pir1 = ((Math.PI)*(pir));
        System.out.println("Su area es : "+pir1);
        
        double pi2 = ((Math.PI)*2);
        double peri= pi2*radio;
        System.out.println("Su perimetro es: "+peri);
        
    }
    
}
