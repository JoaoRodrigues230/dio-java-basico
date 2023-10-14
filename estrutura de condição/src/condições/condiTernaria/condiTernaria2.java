package condições.condiTernaria;

import java.util.Scanner;

public class condiTernaria2 {
    public static void main(String[] args) {
         double nota;

        Scanner ler = new Scanner(System.in);

        nota = ler.nextDouble();

        String resultado = nota >= 7 ? "APROVADO!" : nota >=5 && nota <7 ? "RECUPERAÇÃO!" : "REPROVADO!";

        System.out.print(resultado);
    }
}
