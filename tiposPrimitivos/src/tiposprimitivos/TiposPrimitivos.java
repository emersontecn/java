
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
        System.out.println("digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.format("digite a nota de %s\n",nome);
        Float nota = teclado.nextFloat();
        System.out.format("A nota de %s é de %.1f \n",nome,nota);
        float media = nota/4;
        System.out.format("com media de %.1f \n ",media);
    }
    
    
}
