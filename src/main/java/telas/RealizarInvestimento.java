package telas;
import dominios.InvestimentoCorretora;
import dominios.Profile;
import dominios.TiposDeInvestimento;
import java.util.Arrays;
import java.util.Scanner;
import dominios.Client;
import serviços.PegarInvestimento;
import serviços.operações.Investir;

public class RealizarInvestimento {

    public static void processoInvestimento(Scanner scanner, Client usuario) {
        Investir investir = new Investir();
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        double quantidadeComparada = scanner.nextDouble();
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String tipoDeInvestimentoEscolhido = scanner.next().toUpperCase();
        System.out.println("Escolha qual investimento desse tipo deseja adquirir.");
        System.out.println(TiposDeInvestimento.valueOf(tipoDeInvestimentoEscolhido).getTipos());
        String ativoEscolhido = scanner.next();
        InvestimentoCorretora investimento = PegarInvestimento.pegarInvestimento(tipoDeInvestimentoEscolhido, ativoEscolhido);
        investir.investir(usuario, quantidadeComparada, tipoDeInvestimentoEscolhido, investimento);


    }
}