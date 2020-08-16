/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 02. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa mostrará se o número inserido é positivo ou negativo \n"
                + "Insira o número desejado e pressione a tecla ENTER");
        int valor = scan.nextInt();
        
        if (valor >= 0){
            System.out.println("O número informado foi " + valor + " e é POSITIVO!");
        } else {
            System.out.println("O número informado foi " + valor + " e é NEGATIVO!");
        }
        
    }

}
