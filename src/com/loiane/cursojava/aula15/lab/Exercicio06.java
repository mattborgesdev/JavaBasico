/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 06. Faça um Programa que leia três números e mostre o maior deles
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa fará a leitura de três números e informará o maior deles \n"
                + "Entre com o 1º número e pressione a tecla ENTER");
        int n1 = scan.nextInt();
        
        System.out.println("Entre com o 2º número e pressione a tecla ENTER");
        int n2 = scan.nextInt();
        
        System.out.println("Entre com o 3º número e pressione a tecla ENTER");
        int n3 = scan.nextInt();
        
        if(n1 >= n2 && n1 >= n3){
            System.out.println(n1 + " é o maior número");
        } else if(n2 >= n1 && n2 >= n3){
            System.out.println(n2 + " é o maior número");
        } else if(n3 >= n1 && n3 >= n2){
            System.out.println(n3 + " é o maior número");
        } else if(n1 == n2 && n1 == n3 && n2 == n3){
            System.out.println("Todos os três números são iguais!");
        }
        
    }
    
}