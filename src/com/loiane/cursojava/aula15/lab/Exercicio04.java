/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 04. Faça um Programa que verifique se a letra digitada é vogal ou consoante.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa verificará se a letra informada é vogal ou consoante \n"
                + "Informe uma letra e pressione a tecla ENTER");
        String input = scan.next();
        
        /* VERSÃO 1:
        if(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")){
            System.out.println("A letra informada é uma vogal!");
        } else {
            System.out.println("A letra informada é uma consoante!"); 
        } */
        
        // VERSÃO 2:
        if (input.length() > 1) {
            System.out.println("Não é uma letra válida!");
        } else {
            switch(input){
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U": System.out.println("A letra informada é uma vogal!"); break;
                default:  System.out.println("A letra informada é uma consoante!");
            }
        }
      
    }
    
}
