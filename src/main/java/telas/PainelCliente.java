package telas;
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
                    "5 - Fazer simulação do investimento desejado\n" +
                    "0 - Logoff");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    Investir.processoInvestimento(scanner, usuario);
//                    RealizarInvestimento realizarInvestimento = new RealizarInvestimento();
//                    InserirQuantidadeAtivoComprado quantidadeComparada = new InserirQuantidadeAtivoComprado();
//                    InserirInvestimentoRecomendado investimentoRecomendado = new InserirInvestimentoRecomendado();
//                    realizarInvestimento.investir(scanner, usuario, quantidadeComparada, investimentoRecomendado);
                    break;
                case "2":
                    ValorARetirar valorRetirado = new ValorARetirar();
                    valorRetirado.valorARetirar(usuario);
                    System.out.println();
                    break;
                case "3":
                    ConsultarInvestimentosDoCliente.consultarInvestimentosDoCliente(usuario);
                case "4":
                    System.out.println(Arrays.asList(TiposDeInvestimento.values()));;
                    break;
                case "5":
                    SimularInvestimento.simulacao(scanner);
                case "0":
                    break;
                default:
                    acessar(scanner, usuario);
            }

        } while (!opcao.equals("0"));

    }
}
