import java.util.Scanner;

public class Bank
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;

            while (continuar) 
            {
                System.out.println("---"+saldo+"---");
                System.out.println("opçao 1: depositar.");
                System.out.println("opçao 2: sacar.");
                System.out.println("opçao 3: consultar saldo");
                System.out.println("opçao 0: encerrar. \n");
                int opcao = scanner.nextInt();

                switch (opcao) 
                {
                    case 1 -> {
                        System.out.println("Saldo atual: "+saldo);
                        System.out.println("digite o valor que deseja depositar: \n");
                        Double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.println("depósitoto concluído");
                        continue;
                    }
                    case 2 -> {
                        System.out.println("qual valor você deseja sacar?");
                        Double saque = scanner.nextDouble();
                        if (saque > saldo)
                        {
                            continue;
                        }
                        saldo -= saque;
                        System.out.println("Saldo insuficiente");
                        continue;
                    }
                    case 3 -> {
                        System.out.println("Saldo atual: "+saldo);
                        continue;
                    }
                    case 0 -> {
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    }
                    default -> System.out.println("Opçao inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }
}