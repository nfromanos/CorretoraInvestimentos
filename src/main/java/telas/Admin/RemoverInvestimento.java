package telas.Admin;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;
import serviços.PegarInvestimento;

import java.util.Arrays;
import java.util.Scanner;

public class RemoverInvestimento {

    public static void removerInvestimento(Scanner scanner){
        System.out.println("Qual o Tipo de investimento deseja remover?");
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));;
        String tipoInvestimento = scanner.next();
        System.out.println("Qual investimento deseja remover?");
        String ativoInvestido = scanner.next();
        InvestimentoCorretora investimento = PegarInvestimento.pegarInvestimento(tipoInvestimento, ativoInvestido);
        TiposDeInvestimento.valueOf(tipoInvestimento).getTipos().remove(investimento);
        System.out.printf("Investimento %s do tipo %s removido com sucesso.", ativoInvestido, tipoInvestimento);
    }
}
