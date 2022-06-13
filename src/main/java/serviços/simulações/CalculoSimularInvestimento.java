package serviços.simulações;
import dominios.TiposDeInvestimento;

import java.util.Scanner;

public class CalculoSimularInvestimento<T> {

    public static String simulacaoInvestimento(Scanner scanner, String tipoInvestimento, double valorInvestido, int segundos){
        double variacaoAtivo = TiposDeInvestimento.valueOf(tipoInvestimento).getVariacaoDoAtivo();
        double valorSimulado = valorInvestido * Math.pow(variacaoAtivo, segundos);
        return String.format("%s", valorSimulado);
    }

}
