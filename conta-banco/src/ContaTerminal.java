import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //Todo: Connhecer a importar a classe Scanner

       //Exibir as mensagem para nosso usuário

       //Obter pela Scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome: ");
       String nome = scanner.next();

       System.out.println("Digite o número da conta: ");
       int numeroConta = scanner.nextInt();

       System.out.println("Digite o número da agencia: ");
       String numeroAgencia = scanner.next();       

       System.out.println("Digite o saldo: ");
       double saldo = scanner.nextDouble();

       System.out.println("Olá" + nome + "obrigado por criar uma conta em nosso banco, ");
       System.out.println("sua agência é " + numeroAgencia + ", conta " + numeroConta);
       System.out.println("e seu saldo "+ saldo + "ja esta disponível para saque.");


    }
}
