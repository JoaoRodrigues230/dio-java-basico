package condições.switchCase;

import java.util.Scanner;

public class sistemaMedida {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        String sigla = ler.nextLine();

        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
            }
    }
}
