/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = teclado.nextInt();
        int div = num / 2;
         System.out.format("valor %s dividido por 2\n",num,div);
         System.out.printf("resultado=%s\n",div);
        int soma = num + 10;
        System.out.printf("valor %s mias 10\n",num);
         System.out.printf("resultado=%s\n",num);
    }
    
}
