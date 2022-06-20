package telas;
import dominios.Client;
import java.util.Scanner;

public class PainelCorretora {

    public static void acessar(Scanner scanner, Client usuario) {
        String opcao;
        do {
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Ver investimento dos clientes\n" +
                    "2 - Retirar investimento\n" +
                    "3 - Acompanhar os investimentos\n" +
                    "4 - Ver tipos de investimentos\n" +
                    "5 - Fazer simulação do investimento desejado\n" +
                    "0 - Logoff");
            opcao = scanner.next();
            switch (opcao) {

            }

        } while (!opcao.equals("0"));

    }
}