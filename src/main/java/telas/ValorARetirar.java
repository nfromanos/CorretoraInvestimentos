package telas;
import dominios.Client;
import dominios.RetirarInvestimento;

import java.util.Scanner;

public class ValorARetirar {

    public void valorARetirar(Client usuario) {
        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Qual investimento deseja retirar? Entrar ACAO, TESOURO ou FUNDOS.");
//        String investimentoEscolhido = scanner.next();
        System.out.printf("%nQuanto deseja retirar?%n");
        double valorARetirar = scanner.nextDouble();
        RetirarInvestimento retirarInvestimento = new RetirarInvestimento();
        retirarInvestimento.retirarInvestimento(valorARetirar, usuario);
    }
}