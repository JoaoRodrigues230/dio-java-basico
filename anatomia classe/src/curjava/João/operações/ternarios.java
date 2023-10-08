package curjava.João.operações;

public class ternarios {
    public static void main(String[] args) {
        int a,b;

        a=5;
        b=6;

        //String resultado ="";
        
        /*//utilizando if e else
        if (a==b)
            resultado = "VERDADEIRO";
        else
            resultado = "FALSO";
*/
        //utilizando operação ternaria
        int resultado = a==b ? 1 : 0;

        System.out.println(resultado);
    }
    
}
