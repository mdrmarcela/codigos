
package pkgwhile.atividade1;

import java.util.Scanner;

public class WhileAtividade1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                
        System.out.print ("digite o nome da pessoa");
        String nome = input.nextLine();
        
        System.out.print ("digite a sua idade");
        int idade = Integer.valueOf (input.nextLine());
        
        while (idade > 100 || idade < 0) {
            System.out.print ("digite a sua idade");
            idade = Integer.valueOf (input.nextLine());
        }
        
        int idadeFinal = idade + 5;
        
        System.out.println("Daqui a 5 anos, sua idade será de: "+idadeFinal);
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  
        
    }
    
}
