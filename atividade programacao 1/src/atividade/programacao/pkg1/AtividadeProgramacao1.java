
package atividade.programacao.pkg1;

import java.util.Scanner;

public class AtividadeProgramacao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print ("digite o preco antigo");
        double precoAntigo = Double.valueOf (input.nextLine());
        
        System.out.print ("digite o preco novo");
        double precoNovo = Double.valueOf (input.nextLine());
        
        double percentualAumento = CalculoAcrescimo(precoAntigo,precoNovo);
        System.out.println ("o valor do acrescimo e de:" + percentualAumento + "%");
      
    }
    
    public static double CalculoAcrescimo (double precoAntigo,double precoNovo){
        double aumento,percentualAumento;
        aumento = precoNovo - precoAntigo; 
        percentualAumento = (aumento/precoAntigo)*100;
        return percentualAumento;
       
        
    }
    
}
