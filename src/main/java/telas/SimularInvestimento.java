package telas;
import serviços.simulações.CalculoSimularInvestimento;

import java.util.Scanner;

public class SimularInvestimento {

    public static void simulacao(Scanner scanner){
        System.out.println("Entre o tipo de investimento que deseja simular: ");
        String tipoInvestimento = scanner.next();
        System.out.println("Qual o valor da simulação?");
        double valor = scanner.nextDouble();
        System.out.println("Por quanto tempo deseja deixar investido? Entre um valor de 1 a 90 segundos");
        int segundos = scanner.nextInt();
        System.out.println(CalculoSimularInvestimento.simulacaoInvestimento(scanner, tipoInvestimento, valor, segundos));
    }
}
