package telas.Cliente;
import dominios.Client;
import dominios.TiposDeInvestimento;
import telas.consultas.ConsultarInvestimentosDoCliente;
import java.util.Arrays;
import java.util.Scanner;

public class PainelCliente {

    public static void acessar(Scanner scanner, Client usuario) {
        String opcao;
        do {
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Investir\n" +
                    "2 - Retirar investimento\n" +
                    "3 - Acompanhar os investimentos\n" +
                    "4 - Ver tipos de investimentos\n" +
                    "0 - Logoff");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    RealizarInvestimento.processoInvestimento(scanner, usuario);
                    break;
                case "2":
                    RetirarInvestimento.retirarInvestimento(usuario);
                    break;
                case "3":
                    ConsultarInvestimentosDoCliente consultar = new ConsultarInvestimentosDoCliente();
                    consultar.consultar(usuario.getUsername());
                    break;
                case "4":
                    System.out.println(Arrays.asList(TiposDeInvestimento.values()));;
                    break;
                case "0":
                    break;
                default:
                    acessar(scanner, usuario);
            }

        } while (!opcao.equals("0"));
    }
}
