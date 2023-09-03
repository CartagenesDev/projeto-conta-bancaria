import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //Todo: Connhecer a importar a classe Scanner

       //Exibir as mensagem para nosso usuário

       //Obter pela Scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.print("Digite seu nome: ");
       String nome = scanner.next();

       System.out.print("Digite o número da agencia: ");
       String numeroAgencia = scanner.next();   

       System.out.print("Digite o número da conta: ");
       int numeroConta = scanner.nextInt();

      
       System.out.print("Digite o saldo: ");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, seus dados são: ");

       
       System.out.println("Agência: " + numeroAgencia) ;
       System.out.println("Conta: " + numeroConta);
       System.out.println("Saldo: " + saldo );
       System.out.println("Já esta disponível para saque.");


    }
}
