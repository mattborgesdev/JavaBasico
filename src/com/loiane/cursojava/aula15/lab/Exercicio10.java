/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 10. Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem "Bom dia!", "Boa tarde!" ou "Boa noite!" ou "Valor inválido!", conforme o caso.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println(">O programa perguntará em que turno você estuda. As opções possíveis de serem inseridas são: \n"
            + "'M' para o turno MATUTINO \n"
            + "'V' para o turno VESPERTINO \n"
            + "'N' para o turno NOTURNO \n");

        System.out.println("Entre com o turno conforme indicado anteriormente e pressione a tecla ENTER:");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
}
