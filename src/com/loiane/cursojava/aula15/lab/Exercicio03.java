/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 03. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra, escrever: F - Feminino, M - Masculino, Sexo Inválido.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa verificará a classificação das letras 'M' ou 'F'");
        System.out.println("Insira a letra 'M' ou 'F' e pressione a tecla ENTER");
        String input = scan.next();
        
        if (input.equalsIgnoreCase("m")){
            System.out.println("A letra informada corresponde ao gênero MASCULINO");
        } else if (input.equalsIgnoreCase("f")){
            System.out.println("A letra informada corresponde ao gênero FEMININO");
        } else {
            System.out.println("A letra informada é inválida.");
        }
        
    }

}
