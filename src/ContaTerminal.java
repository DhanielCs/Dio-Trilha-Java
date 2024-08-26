import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println(" Olá Seja Bem-Vindo(a) ao Seu Banco Digital.");
        System.out.println(" Vamos Iniciar o Cadastro da sua Conta Bancária, Preciso de Alguns Dados para Iniciar.");

        String Agencia;
        int NumeroDaConta = 0;
        String NomeCliente;
        float SaldoConta = 0;;

        System.out.println(" Por Favor ,Insira seu Nome Completo :");
        NomeCliente = ler.nextLine();
        System.out.println(" Agora Insira sua Agência : ");
        Agencia = ler.next();
        System.out.println(" Otimo, por favor Insira sua Conta : ");
        NumeroDaConta = ler.nextInt();
        System.out.println(" Para Finalizar , Insira seu  Saldo para adicionar a sua Conta : ");
        SaldoConta = ler.nextFloat();

        System.out.println(" Olá "+(NomeCliente)+", obrigado por criar uma conta em nosso banco, \n" +
                            "sua agência é "+(Agencia)+", conta "+(NumeroDaConta)+" e seu saldo R$ "+(SaldoConta)+
                             " já está disponível para saque.");



    }
}