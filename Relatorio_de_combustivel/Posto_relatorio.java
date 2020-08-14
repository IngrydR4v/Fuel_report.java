import java.util.Scanner;

public class Posto_relatorio {

    public static void RelatorioCombustivel() {
        
        int qtdAbastecimentos = 2;

        Scanner scanner = new Scanner(System.in);
        String[][] dados = new String[50][3];

        for (int i = 0; i < qtdAbastecimentos; i++) {
            System.out.println("Informe o nome do motorista: ");
            dados[i][0] = scanner.next();

            System.out.println("Qual tipo de combustível? Etanol ou gasolina: ");
            dados[i][1] = scanner.next();

            System.out.println("Quantos litros abasteceu? ");
            dados[i][2] = scanner.next();
        }
        for (int i = 0; i < qtdAbastecimentos; i++) {
            System.out.println("" +
                    " Motorista " + dados[i][0] + "" +
                    " Combustível " + dados[i][1] + "" +
                    " Litros " + dados[i][2]);
        }
    }
}
