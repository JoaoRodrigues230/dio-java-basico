package Hierarquia;

public class Cep {
    public static void main(String[] args) {
        
        try {

            String cepFormatado = formatarCep("11730000");
            System.out.println(cepFormatado);

        } catch (CepInvalidException e) {
            System.out.println("O CEP NÃO CORRESPONDE COM AS REGRAS DE NEGÓCIO");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidException{
    if (cep.length()!=8)
        throw new CepInvalidException();
    return "11.730-000";
}

}

