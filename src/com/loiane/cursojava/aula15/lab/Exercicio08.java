/**
*
* @author Matheus Borges
* 
* Exercícios de Java - Aula 15
* 08. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
* 
*/
package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();        
        
        df.applyPattern("R$ #,##0.00");
        
        System.out.println("> O programa pedirá o preço de três produtos e informará o mais barato entre eles \n"
                + "Entre com o PREÇO do 1º produto e pressione a tecla ENTER");
        double precoProduto1 = scan.nextDouble();
        
        System.out.println("Entre com o PREÇO do 2º produto e pressione a tecla ENTER");
        double precoProduto2 = scan.nextDouble();
        
        System.out.println("Entre com o PREÇO do 3º produto e pressione a tecla ENTER");
        double precoProduto3 = scan.nextDouble();
        
        if(precoProduto1 <= precoProduto2 && precoProduto1 <= precoProduto3){
            System.out.println("Compre o 1º produto, de valor " + df.format(precoProduto1) + ", pois é o mais barato");
        } else if(precoProduto2 <= precoProduto1 && precoProduto2 <= precoProduto3){
            System.out.println("Compre o 2º produto, de valor " + df.format(precoProduto2) + ", pois é o mais barato");
        } else if(precoProduto3 <= precoProduto1 && precoProduto3 <= precoProduto2){
            System.out.println("Compre o 3º produto, de valor " + df.format(precoProduto3) + ", pois é o mais barato");
        }
        
    }

}
