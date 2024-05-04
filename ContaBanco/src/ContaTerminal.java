import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("******************************** BANCO JAVA ***********************");
        System.out.println("");

        System.out.println("Digite seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Bom dia " + nomeCliente + ", Por favor, Digite o numero da sua conta.");
        int conta = scanner.nextInt();
        
        System.out.println("Obrigado, Agora digite o numero da sua agencia.");
        String agencia = scanner.next();

        double saldo = 237.48;
        System.out.println("");


        System.out.println("******************************** BANCO JAVA ***********************");
        System.out.println("");

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + ", Já está disponivel para saque."
        );
        System.out.println("");
        System.out.println("*******************************************************************");

    }
}
