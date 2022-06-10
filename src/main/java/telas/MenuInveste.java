package telas;
import dominios.Profile;
import dominios.TiposDeInvestimento;
import java.util.Arrays;
import java.util.Scanner;

import dominios.Client;

public class MenuInveste {

    public String menuInvestir(Client usuario, Scanner scanner) {
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        return scanner.next().toUpperCase();
    }

    public double quantidadeAtivo(Scanner scanner) {
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        return scanner.nextDouble();
    }
}
