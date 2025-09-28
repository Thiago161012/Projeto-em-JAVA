import java.util.Scanner;

public class Desafio {
    static void main() {
        String nome = "Thiago Matheus";
        String tipoDeConta = "Corrente";
        double saldoEmConta = 2133.12;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta do cliente: " + tipoDeConta);
        System.out.println("Saldo disponível na conta: " + saldoEmConta);
        System.out.println("\n***********************");

        String menu = """
                *** Bem Vindo ao seu banco digital ***
                1 - Consultar seu saldo 
                2 - Transferir valor 
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

                if (opcao == 1) {
                    System.out.println("Seu saldo atual: " + saldoEmConta);
                }else if (opcao == 2) {
                    System.out.println("Digite o valor que deseja tranferir" );
                    double valor = leitura.nextDouble();
                    if (valor > saldoEmConta) {
                        System.out.println("Não há saldo disponível para realizar essa tranferência");
                    }else {
                        saldoEmConta -= valor;
                        System.out.println("Novo saldo: " + saldoEmConta);
                    }
                }else if (opcao == 3) {
                    System.out.println("Digite o valor que deseja receber");
                    double receber = leitura.nextDouble();
                    saldoEmConta += receber;
                    System.out.println("Novo saldo: " + saldoEmConta);
                }
        }       if (opcao == 4) {
            System.out.println("Você encerrou seu atendimento. Obrigado!!");
        }
    }
}