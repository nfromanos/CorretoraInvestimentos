package telas;
import dominios.Client;
import serviços.operações.RetirarInvestimento;

import java.util.Scanner;

public class ValorARetirar {

    public void valorARetirar(Client usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nQuanto deseja retirar?%n");
        double valorARetirar = scanner.nextDouble();
        RetirarInvestimento retirarInvestimento = new RetirarInvestimento();
        retirarInvestimento.retirarInvestimento(valorARetirar, usuario);
    }
}