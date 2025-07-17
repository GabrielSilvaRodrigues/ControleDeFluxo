
import br.com.dio.exception.ParametrosInvalidosException;
import br.com.dio.model.Contador;
import br.com.dio.validator.ContadorValidator;
import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);
    private static final Contador contados = new Contador();
    public static void main(String[] args) throws Exception {
        sc.nextLine();
        requisitarOsParametros();
    }
    private static Contador requisitarOsParametros() throws ParametrosInvalidosException{
        System.out.println("Informe o primeiro parâmetro: ");
        var parametroUm = sc.nextInt();
        System.out.println("Informe o segundo parâmetro: ");
        var parametroDois = sc.nextInt();
        var contador = new Contador(parametroUm, parametroDois);
        ContadorValidator.VerificarContador(contador);
        return contador;
    }
}
