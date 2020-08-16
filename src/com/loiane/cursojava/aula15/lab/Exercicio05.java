/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 05. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
* o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
* o A mensagem "Reprovado", se a média for menor do que sete;
* o A mensagem "Aprovado com Distinção", se a média for igual a dez.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("> O programa informará o resultado da média de duas notas inseridas \n"
                + "Entre com o valor da 1ª nota e pressione a tecla ENTER");
        int nota1 = scan.nextInt();
        
        System.out.println("Entre com o valor da 2ª nota e pressione a tecla ENTER");
        int nota2 = scan.nextInt();
        
        int media = (nota1+nota2)/2;
        
        if(media == 10){
            System.out.println("APROVADO(A) COM DISTINÇÃO!");
        } else if (media >= 7) {
            System.out.println("APROVADO(A)!");
        } else {
            System.out.println("REPROVADO(A)!");
        }
        
    }

}
