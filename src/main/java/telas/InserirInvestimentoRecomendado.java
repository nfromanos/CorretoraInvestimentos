package telas;
import dominios.Profile;
import dominios.TiposDeInvestimento;
import java.util.Arrays;
import java.util.Scanner;

import dominios.Client;

public class InserirInvestimentoRecomendado {

    public String getInvestimentoRecomendado(Client usuario, Scanner scanner) {
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        return scanner.next().toUpperCase();
    }
}
