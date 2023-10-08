package curjava.João.argumentos;

public class aboutMe {
    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
    
        System.out.println("NOME: " + nome " " + sobrenome);
        System.out.println("IDADE:"  + idade);
        System.out.println("ALTURA: " + altura);
    
    }
    
}
