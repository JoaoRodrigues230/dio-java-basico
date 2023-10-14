package condições.condiTernaria;

import java.util.Scanner;

public class condiTernaria {
    public static void main(String[] args) {
        double nota;

        Scanner ler = new Scanner(System.in);

        nota = ler.nextDouble();

        String resultado = nota >= 7 ? "APROVADO!" : "REPROVADO!";

        System.out.print(resultado);
    }
}
