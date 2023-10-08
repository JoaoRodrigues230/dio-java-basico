package curjava.João.ex2;
public class MinhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "João";
    String segundoNome = "Rodrigues";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Retorno do Método = " + primeiroNome.concat(" ").concat(segundoNome);
}

}
