package telas;
import dominios.TiposDeInvestimento;
import serviços.simulações.CalculoSimularInvestimento;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimularInvestimento {

    public static void simulacao(Scanner scanner){
        System.out.println("Entre o tipo de investimento que deseja simular: ");
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String tipoInvestimento = scanner.next().toUpperCase();
        System.out.println("Qual ativo deseja investir?");
        System.out.println(Collections.singletonList(TiposDeInvestimento.valueOf(tipoInvestimento).getTipos()));
        String ativoInvestimento = scanner.next();
        System.out.println("Qual o valor da simulação?");
        double valor = scanner.nextDouble();
        System.out.println("Por quanto tempo deseja deixar investido? Entre um valor de 1 a 90 segundos");
        int segundos = scanner.nextInt();
        System.out.println(CalculoSimularInvestimento.simulacaoInvestimento(tipoInvestimento, ativoInvestimento, valor, segundos));
    }
}
