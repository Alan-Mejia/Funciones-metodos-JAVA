package com.alan;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mensaje= saludar("Alan");
        System.out.println(mensaje);
        System.out.println(suma(8 ,10));
        alerta("Funcion void No devuelve valor alguno");
        System.out.println(Math.PI);
        double numero_prueba1= 25.4;
        double numero_prubea2 = 17.67;
        System.out.println("Math.ceil lo que hace es redondear el numero pero hacia arriba: " +Math.ceil(numero_prueba1));
        //System.out.println(Math.sqrt("Raiz de 17.67: " + Math.sqrt(numero_prubea2));
        String mensaje2 = "Holaaaa";
        System.out.println(mensaje2.length());
        System.out.println(mensaje.compareTo(mensaje2));
        System.out.println(mensaje.equals(mensaje2));//Comapara si son igualaes y da un true/false
        System.out.println(mensaje.equalsIgnoreCase(mensaje2));//Compara sin tomar en cuenta mayusculas y minuscular y da un true/false
        System.out.println(mensaje2.toUpperCase());
    }

    public static String saludar(String nombre){
        return "Hola como estas "+ nombre;
    }

    public static int suma(int num1, int num2){
        return num1+num2;
    }

    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
