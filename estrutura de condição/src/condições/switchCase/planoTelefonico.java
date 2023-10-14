package condições.switchCase;

import java.util.Scanner;

public class planoTelefonico {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("ESCOLHA SEU PLANO TELEFÔNICO: \n");
        System.out.println("B - BASIC: 100 minutos de ligação\n");
        System.out.println("M - MIDIA: 100 minutos de ligação + Whats e Instagram grátis\n");
        System.out.println("T - TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube\n");

        String pacote = ler.nextLine();

        switch(pacote){
            case "B":{
                System.out.println("B - BASIC: 100 minutos de ligação\n");
                break;
            }
            case "M":{
                System.out.println("B - BASIC: 100 minutos de ligação\n");
                System.out.println("M - MIDIA: 100 minutos de ligação + Whats e Instagram grátis\n");
                break;
            }
            case "T":{
                System.out.println("B - BASIC: 100 minutos de ligação\n");
                System.out.println("M - MIDIA: 100 minutos de ligação + Whats e Instagram grátis\n");
                System.out.println("T - TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube\n");
                break;
            }
            default:
                System.out.println("NÃO EXISTE ESSA OPÇÃO DE PACOTE");
        }   
    }   
}
