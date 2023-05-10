
package trabalho.sigaa;

import java.util.Scanner;

public class TrabalhoSigaa {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       int cadastrosBasicos,relatoriosSimples,relatoriosElaborados,casoDeUsoA,casoDeUsoB,casoDeUsoC;
       String tipoDeSistema;
       double valorHoraDoProgramador,valorHoraDoAnalista;
       
       System.out.println ("Informe quantos cadastros basicos o cliente deseja:");
       cadastrosBasicos = Integer.valueOf (input.nextLine());
       System.out.println ("Informe quantos relatorios simples o cliente deseja:");
       relatoriosSimples = Integer.valueOf (input.nextLine());
       System.out.println ("Informe quantos relatorios elaborados o cliente deseja:");
       relatoriosElaborados = Integer.valueOf (input.nextLine());
       System.out.println ("Informe quantos casos de uso tipo A o cliente deseja:");
       casoDeUsoA = Integer.valueOf (input.nextLine());
       System.out.println ("Informe quantos casos de uso tipo B o cliente deseja:");
       casoDeUsoB = Integer.valueOf (input.nextLine());
       System.out.println ("Informe quantos casos de uso tipo C o cliente deseja:");
       casoDeUsoC = Integer.valueOf (input.nextLine());
       
       System.out.println ("informe o tipo de sistema que o cliente deseja:(desktop/web/mobile)");  
       tipoDeSistema = String.valueOf (input.nextLine());
       
       valorHoraDoProgramador = 50.00;
       valorHoraDoAnalista = 80.00;
       
       //area de cálculo do tempo em horas
      int horasCadastroBasico = cadastrosBasicos*4;
      double horasRelatoriosSimples = relatoriosSimples*0.5;
       // 30 minutos = 0.5 hora
       // 1hora = 1.1/2 == 0.5
      int horasRelatorioElaborado = relatoriosElaborados;
      int horasCasoDeUsoA = casoDeUsoA * 8;
      int horasCasoDeUsoB = casoDeUsoB *16;
      int horasCasoDeUsoC = casoDeUsoC *24;
      double totalHoras = horasCadastroBasico + horasRelatoriosSimples +  horasRelatorioElaborado + horasCasoDeUsoA + horasCasoDeUsoB + horasCasoDeUsoC;
      
      // area de cálculo do tempo do analista em horas 
      double tempoAnalista = totalHoras*0.2;
      
      // area de cálculo ajuste de tempo para o tipo de sistema
      if (tipoDeSistema.equalsIgnoreCase ("web")) {
          totalHoras = totalHoras + totalHoras*0.15;
          tempoAnalista = tempoAnalista + tempoAnalista*0.15; }
     
      else if (tipoDeSistema.equalsIgnoreCase("mobile")) {
          totalHoras = totalHoras + totalHoras*0.25;
          tempoAnalista = tempoAnalista + tempoAnalista*0.25; }
          
     // area de cálculo do custo total em reais 
     double gastoProgramador = totalHoras * valorHoraDoProgramador;
     double gastoAnalista = tempoAnalista * valorHoraDoAnalista;
     double gastoTotal = gastoProgramador + gastoAnalista;
     
     // saída 
     System.out.println ("o valor a ser cobrado e de: R$" + gastoTotal);
            
    }
    
}
