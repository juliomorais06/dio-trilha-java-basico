import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem vindo ao Banco DIO!\nDigite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Qual é o seu número de usuário(Enter para a próxima etapa): ");
        int usuario = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        String conta  = scanner.next();

        System.out.println("Qual é o seu saldo? ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+" "+sobrenome+"(user: "+usuario+"), obrigado por criar uma conta em nosso Banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}