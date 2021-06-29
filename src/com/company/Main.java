package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // exercicio 2.1
        int[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(array);
        System.out.println("ascendente");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("\ndescendente");
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

        // exercicio 2.2
        /*double empresaX = 1.13;
        double empresaY = 18.4;
        int ano = 2021;
        System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaX) +"m");
        System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaY) +"m");
        System.out.println("-----------------------------------------------------------------------------");
        while(empresaX < empresaY){
            empresaX += empresaX*1.48;
            empresaY += empresaY*0.32;
            ano++;
            System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaX) +"m");
            System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaY) +"m");
            System.out.println("-----------------------------------------------------------------------------");
        }*/

        // exercicio 2.3
        /*Produto[] aProduto = new Produto[3];
        double vlTotal = 0.0;

        aProduto[0] = new Produto(1,"Arroz", 10.99,2);
        aProduto[1] = new Produto(2,"Feijão", 14.49,1);
        aProduto[2] = new Produto(3,"Tomate", 9.99,5);

        System.out.println("lista de produtos: ");

        int len = aProduto.length;
        for (int i = 0; i<len; i++){
            System.out.println(aProduto[i].toString()+"\n");
            vlTotal += aProduto[i].getPreco() * aProduto[i].getQuantidade();
        }

        System.out.println("Valor Total: R$"+ String.format("%.2f",vlTotal));*/


    }
}
