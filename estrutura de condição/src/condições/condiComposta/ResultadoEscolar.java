package condições.condiComposta;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE A NOTA DO ALUNO: ");
        int nota = ler.nextInt();

        if(nota>=7){
            System.out.println("APROVADO!");
        }else
            System.out.println("REPROVADO!");
    }
    
}
