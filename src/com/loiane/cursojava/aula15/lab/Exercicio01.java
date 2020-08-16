/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 01. Faça um Programa que peça dois números e imprima o maior deles.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {  
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa mostrará o maior valor entre dois números \n"
                + "Entre com o 1º número e pressione a tecla ENTER");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o 2º número e pressione a tecla ENTER");
        int num2 = scan.nextInt();
        
        int resultado = num1+num2;
        System.out.println("O resultado da soma do 1º número com o 2º número é igual a " + resultado);
    }
    
}
