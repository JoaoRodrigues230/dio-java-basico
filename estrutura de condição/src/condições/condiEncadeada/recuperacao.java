package condições.condiEncadeada;

import java.util.Scanner;

public class recuperacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE A NOTA DO ALUNO: ");
        
        double nota = ler.nextDouble();
        
        if (nota >= 7)
            System.out.println("APROVADO!");
        
        else if (nota >=5 && nota < 7)
            System.out.println("RECUPERAÇÃO DE NOTA!");
        
        else
            System.out.println("REPROVADO!");
        }
    }

