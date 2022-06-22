package telas;
import dominios.Client;

import java.util.Arrays;
import java.util.Scanner;

import dominios.TiposDeInvestimento;
import telas.consultas.ConsultarInvestimentoDeTodosOsClientes;
import telas.consultas.ConsultarListaDeClientes;

public class PainelCorretora {

    public static void acessar(Scanner scanner, Client usuario) {
        String opcao;
        do {
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Criar investimentos\n" +
                    "2 - Remover investimento\n" +
                    "3 - Acompanhar os investimentos\n" +
                    "4 - Listar usuarios\n" +
                    "5 - Listar Investimentos de todos os usuarios\n" +
                    "0 - Logoff");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    CriarInvestimento criarInvestimento = new CriarInvestimento();
                    criarInvestimento.criarInvestimento(scanner);
                    break;
                case "2":
                    System.out.println(Arrays.asList(TiposDeInvestimento.ACAO.getTipos()));
                    break;
                case "3":

                    break;
                case "4":
                    ConsultarListaDeClientes consultaCliente = new ConsultarListaDeClientes();
                    consultaCliente.consultar();
                    break;
                case "5":
                    ConsultarInvestimentoDeTodosOsClientes consultaInvestimento = new ConsultarInvestimentoDeTodosOsClientes();
                    consultaInvestimento.consultar();
                    break;
                case "0":
                    break;
                default:
                    acessar(scanner, usuario);
            }

        } while (!opcao.equals("0"));
    }
}