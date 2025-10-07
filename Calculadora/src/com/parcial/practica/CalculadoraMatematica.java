/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcial.practica;

import java.util.Scanner;

/**
 *
 * @author Merly
 */
public class CalculadoraMatematica {
    
    
    private double num1; // Atributo privado para guardar el primer numero
    private double num2; // Atributo privado para guardar el segundo numero
    public double resultado; // Atributo para guardar el resultado de los numeros anteriores.
    
    public CalculadoraMatematica(){ // Constructor para inicializar los atributos num1 y num2.
        this.num1=0;
        this.num2=0;
        
    }
    
    public void establecerNumeros(double numero1, double numero2){ // Método para establecer los parametros introducidos a los atributos || Los parámetros de entrada son numero1 y numero2, que son los datos que se procesarán
        this.num1=numero1; // Se le pasa a los atributos, los parámetros que se introdujeron.
        this.num2=numero2;
        
    }
   
    public double opSuma(){ // Método para sumar ambos números. Recibe los parámetros num1 y num2 y retorna resultado.
       return num1+num2;   
    }
    
   
    public double opResta(){ // Método para restar ambos números. Recibe los parámetros num1 y num2  y retorna resultado.
       return num1-num2;
       
    }
    
    public double opMult(){ // Método para multiplicar ambos números. Recibe los parámetros num1 y num2  y retorna resultado.
        return num1*num2;
        
    }
    
    public double opDiv(){ // Método para dividir ambos números. Recibe los parámetros num1 y num2  y retorna resultado.
        if (num2==0){ // Validar que el segundo número no sea 0
            System.out.println("No se puede dividir entre 0"); 
        }
        else {
            return num1/num2;
            
        }
        
        return 0;
        
    
    }

   
    // ----------------------  Main ------------------------------
   
    public static void main(String[] args) {
       
        CalculadoraMatematica calculadora = new CalculadoraMatematica(); // Instanciar un objeto (calculadora)
        Scanner sc = new Scanner(System.in); // Instanciar el scanner
        
        int opcion; // Declaración de la variable opcion
        
            do {
                System.out.println("Calculadora Matematica");
                System.out.println("1. Ingresar numeros");
                System.out.println("2. Suma");
                System.out.println("3. Resta");
                System.out.println("4. Multiplicacion");
                System.out.println("5. Division");
                System.out.println("0. Salir");
                
                 System.out.print("Ingrese la opcion: ");
                 opcion= sc.nextInt();
                 

                 
                 switch(opcion){
                     case 1:
                      introducirNums(sc,calculadora); // Llamar el método para introducir los numeros que se van a procesar.
                      
                      break;
                      
                     case 2:
                         System.out.println("El resultado de la suma es: "+ calculadora.opSuma());
                         // Llamar el método para sumar.
                         break;
                     case 3: 
                          System.out.println("El resultado de la resta es: "+ calculadora.opResta()); // Llamar el método para restar.
                         break;
                     case 4: 
                          System.out.println("El resultado de la multiplicacion es: "+ calculadora.opMult());// Llamar el método para multiplicar.
                         break;
                     case 5:
                         System.out.println("El resultado de la division es: "+ calculadora.opDiv()); // Llamar el método para dividir.
                         break;
                     }
                 
                     
                 }
            while (opcion!=0); // Se ejecuta mientras la opción no sea 0 (Ya que sale del bucle).
      
    }
    public static void introducirNums(Scanner num1, CalculadoraMatematica calculadora){ // Método para introducir números || Se solicita el parametro de num1, el cual se lee.
           System.out.print("Introduzca el primer numero: "); 
           Double numero1= num1.nextDouble(); // Se declara la variable numero1 y en la misma se almacena el numero que se introdujo anteriormente.
           System.out.print("Introduzca el segundo numero: ");
           Double numero2=num1.nextDouble();  // Se declara la variable numero1 y en la misma se almacena el numero que se introdujo anteriormente.
           calculadora.establecerNumeros(numero1, numero2); // Se le pasan los parametros ya guardados al método establecerNumeros.
    }

 
    
    
        
}
    
    

