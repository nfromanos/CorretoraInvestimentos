package telas;
import dominios.Profile;
import dominios.TiposDeInvestimento;
import serviços.operações.RealizarInvestimento;

import java.util.Arrays;
import java.util.Scanner;
import dominios.Client;

import serviços.operações.RealizarInvestimento;

public class Investir {

    public static void processoInvestimento(Scanner scanner, Client usuario) {
        RealizarInvestimento realizarInvestimento = new RealizarInvestimento();
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        double quantidadeComparada = scanner.nextDouble();
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String investimentoAdquirido = scanner.next().toUpperCase();
        realizarInvestimento.investir(scanner, usuario, quantidadeComparada, investimentoAdquirido);
    }
}
