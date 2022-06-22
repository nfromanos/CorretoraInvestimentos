package telas.Admin;
import Factorys.FactoryTipoDeInvestimento;
import dominios.TiposDeInvestimento;
import java.util.Arrays;
import java.util.Scanner;

public class CriarInvestimento {

    public void criarInvestimento(Scanner scanner){
        System.out.println("Qual o tipo de investimento a ser criado?");
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String tipoDeInvestimentoSelecionado = scanner.next().toUpperCase();
        System.out.println("Qual vai ser o nome do investimento?");
        String nomeDoInvestimentoSelecionado = scanner.next();
        System.out.println("Qual a variação do investimento? Ex: 1.05");
        double variacaoDoInvestimento = scanner.nextDouble();
        System.out.println(FactoryTipoDeInvestimento.criarInvestimento(tipoDeInvestimentoSelecionado, nomeDoInvestimentoSelecionado, variacaoDoInvestimento));

    }

}
