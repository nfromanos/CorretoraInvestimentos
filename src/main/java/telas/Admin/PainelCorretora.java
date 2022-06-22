package telas.Admin;

import java.util.Scanner;

import telas.consultas.*;

public class PainelCorretora {

    public static void acessar(Scanner scanner) {
        String opcao;
        do {
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Criar ativo\n" +
                    "2 - Remover ativo\n" +
                    "3 - Listar todos os ativos\n" +
                    "4 - Consultar ativo específico\n" +
                    "5 - Listar usuarios\n" +
                    "6 - Consultar usuário específico\n" +
                    "7 - Listar Investimentos de todos os usuarios\n" +
                    "8 - Consultar investimento de usuário específico\n" +
                    "0 - Logoff");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    CriarInvestimento criarInvestimento = new CriarInvestimento();
                    criarInvestimento.criarInvestimento(scanner);
                    break;
                case "2":
                    RemoverInvestimento.removerInvestimento(scanner);
                    break;
                case "3":
                    ConsultarTodosOsAtivos consultarTodosOsAtivos = new ConsultarTodosOsAtivos();
                    consultarTodosOsAtivos.consultar();
                    break;
                case "4":
                    System.out.println("Entre o nome do ativo.");
                    ConsultarAtivo consultarAtivo = new ConsultarAtivo();
                    consultarAtivo.consultar(scanner.next());
                    break;
                case "5":
                    ConsultarListaDeClientes consultaCliente = new ConsultarListaDeClientes();
                    consultaCliente.consultar();
                    break;
                case "6":
                    System.out.println("Entre o nome do cliente.");
                    ConsultarClienteEspecifico consultarClienteEspecifico = new ConsultarClienteEspecifico();
                    consultarClienteEspecifico.consultar(scanner.next());
                    break;
                case "7":
                    ConsultarInvestimentoDeTodosOsClientes consultarInvestimentoDeTodosOsClientes = new ConsultarInvestimentoDeTodosOsClientes();
                    consultarInvestimentoDeTodosOsClientes.consultar();
                    break;
                case "8":
                    System.out.println("Entre o nome do cliente.");
                    ConsultarInvestimentosDoCliente consultarInvestimentosDoCliente = new ConsultarInvestimentosDoCliente();
                    consultarInvestimentosDoCliente.consultar(scanner.next());
                    break;
                case "0":
                    break;
                default:
                    acessar(scanner);
            }

        } while (!opcao.equals("0"));
    }
}