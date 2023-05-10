
package atividade.programacao.pkg2;

import java.util.Scanner;

public class AtividadeProgramacao2 {
    
    public static float calculeMediaAritimetica (float nota1,float nota2, float nota3) {
     return (nota1+nota2+nota3)/3;
    }
    
    public static float calculeMediaPonderada(float nota1,float nota2, float nota3) {
     return (nota1*nota2*nota3*2)/5;
    }
    
    public static float calculeMediaGeometrica (float nota1,float nota2, float nota3) {
     return (float) Math.cbrt(nota1*nota2*nota3);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
       float media;
   
       System.out.print ("digite a primeira nota");
       float nota1 = Float.valueOf (input.nextLine());
       
       System.out.print ("digite a segunda nota");
       float nota2 = Float.valueOf (input.nextLine()); 
       
       System.out.print ("digite a terceira nota nota");
      float nota3 = Float.valueOf (input.nextLine());
       
       System.out.print ("digite o tipo da media");
      char tipo =  input.nextLine().charAt(0);
        
       switch (tipo) {
               case 'A':media = calculeMediaAritimetica(nota1,nota2,nota3);
               break;
                   
               case 'B': media = calculeMediaPonderada (nota1,nota2,nota3);
               break;
               
               case 'C': media= calculeMediaAritimetica (nota1,nota2,nota3);
               break;
               default: System.out.println ("Erro");
               media = 0;
    
    System.out.println ("media:"+media);
                       }
      
    }
    
}
