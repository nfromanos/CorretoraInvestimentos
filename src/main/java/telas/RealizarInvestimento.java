package telas;
import dominios.Profile;
import dominios.TiposDeInvestimento;

import java.util.Arrays;
import java.util.Scanner;
import dominios.Client;

public class RealizarInvestimento {

    public static void processoInvestimento(Scanner scanner, Client usuario) {
        serviços.operações.RealizarInvestimento realizarInvestimento = new serviços.operações.RealizarInvestimento();
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        double quantidadeComparada = scanner.nextDouble();
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String investimentoAdquirido = scanner.next().toUpperCase();
        realizarInvestimento.investir(usuario, quantidadeComparada, investimentoAdquirido);
    }
}
