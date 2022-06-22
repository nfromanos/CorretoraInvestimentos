package telas.Cliente;
import dominios.Client;
import java.util.Scanner;
import dominios.InvestimentoCliente;
import serviços.operações.Retirar;
import telas.ImprimirValorRetiradoEValorAtual;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class RetirarInvestimento {

    public static void retirarInvestimento(Client usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ativo deseja retirar?");
        String ativo = scanner.next();
        System.out.printf("%nQuanto deseja retirar?%n");
        double valorARetirar = scanner.nextDouble();
        Retirar retirar = new Retirar();
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(usuario.getUsername()) && investimento.getInvestimento().getNomeDoInvestimento().equals(ativo)) {
                System.out.println("Investimento encontrado.");
                ImprimirValorRetiradoEValorAtual.quantidadeRetirada(valorARetirar, investimento);
                if (valorARetirar < investimento.getQuantidadeInvestida() && investimento.getInvestimento().getNomeDoInvestimento().equals(ativo)) {
                    retirar.retirar(valorARetirar, usuario, ativo);
                } else {
                    System.out.println("Você não tem saldo suficiente para realizar esta operação");
                }
            }
        }
    }
}