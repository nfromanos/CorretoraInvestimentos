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
        System.out.printf("%nQuanto deseja retirar?%n");
        double valorARetirar = scanner.nextDouble();
        Retirar retirar = new Retirar();
        for (InvestimentoCliente investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(usuario.getUsername())) {
                ImprimirValorRetiradoEValorAtual.quantidadeRetirada(valorARetirar, investimento);
            }
            if (valorARetirar < investimento.getQuantidadeInvestida()) {
                retirar.retirar(valorARetirar, usuario);
            } else {
                System.out.println("Você não tem saldo suficiente para realizar esta operação");
            }
        }
    }
}