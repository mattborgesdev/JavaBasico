/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 08. Faça um Programa que leia três números e mostre-os em ordem decrescente.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(">O programa pedirá que sejam digitados três números e em seguida os apresentará em ordem decrescente \n"
                + "Entre com o 1º número e pressione a tecla ENTER");
        int n1 = scan.nextInt();
        
        System.out.println("Entre com o 2º número e pressione a tecla ENTER");
        int n2 = scan.nextInt();
        
        System.out.println("Entre com o 3º número e pressione a tecla ENTER");
        int n3 = scan.nextInt();
        
    }

}
