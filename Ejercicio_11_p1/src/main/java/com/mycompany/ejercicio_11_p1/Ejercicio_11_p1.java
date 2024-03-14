package com.mycompany.ejercicio_11_p1;
import java.util.Scanner;

public class Ejercicio_11_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1= scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2= scanner.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double n3= scanner.nextDouble();
        
        if (n1>n2 && n1>n3){
            System.out.println(n1+" es el mayor.");
            if (n2>n3){
                System.out.println(n2+" es el del medio.");
                System.out.println(n3+" es el menor.");
            }else{
                System.out.println(n3+" es el del medio.");
                System.out.println(n2+" es el menor.");
            }
            }
        else if (n2>n1 && n2>n3){
            System.out.println(n2+" es el mayor.");
            if (n1>n3){
                System.out.println(n1+" es el del medio.");
                System.out.println(n3+" es el menor.");
            }else{
                System.out.println(n3+" es el del medio.");
                System.out.println(n1+" es el menor.");
            }
            }
         else if (n3>n1 && n3>n2){
            System.out.println(n3+" es el mayor.");
            if (n1>n2){
                System.out.println(n1+" es el del medio.");
                System.out.println(n2+" es el menor.");
            }else{
                System.out.println(n2+" es el del medio.");
                System.out.println(n1+" es el menor.");
            }
        }
         else if (n1==n2){
            System.out.println(n1+" "+n2+" son iguales.");
            if(n1>n3){
                System.out.println(n1+" es mayor a "+n3);
            }else{
                System.out.println(n1+" es menor a "+n3);
            }
         }
        else if (n1==n3){
            System.out.println(n1+" "+n3+" son iguales.");
            if(n1>n2){
                System.out.println(n1+" es mayor a "+n2);
            }else{
                System.out.println(n1+" es menor a "+n2);
            }
         }
        else if (n2==n3){
            System.out.println(n2+" "+n3+" son iguales.");
            if(n2>n1){
                System.out.println(n3+" es mayor a "+n1);
            }else{
                System.out.println(n3+" es menor a "+n1);
            }
         }
        else if (n1==n2 && n1==n3){
            System.out.println("Los tres son iguales.");
         }
        scanner.close();
    }
}
