package tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {
        try{
       Scanner ler = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("DIGITE SEU NOME: ");
       String nome = ler.next();

       System.out.println("DIGITE SEU SOBRENOME: ");
       String sobrenome = ler.next();

       System.out.println("DIGITE SUA IDADE: ");
       int idade = ler.nextInt();

       System.out.println("DIGITE SUA ALTURA: ");
       double altura = ler.nextDouble();


       //imprimindo os dados obtidos pelos usuarios

       System.out.println("Olá, me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
       System.out.println("Tenho " + idade + " anos");
       System.out.println("Altura: " + altura);
       ler.close();
       }
       catch(InputMismatchException e){
        System.out.println("OS CAMPOS IDADE E ALTURA PRECISAM SER NUMÉRICOS!");
       }
    }
}
