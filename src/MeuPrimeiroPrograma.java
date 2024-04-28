import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class MeuPrimeiroPrograma {


    public static void main(String[] args) {

        String primeiroNome = "William";
        String segundoNome = "Carvalho";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat((segundoNome));
    }

}