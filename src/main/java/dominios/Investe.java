package dominios;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Investe {
    public static final ArrayList<Double> nInvestimentos = new ArrayList<Double>();
    public static final ArrayList<LocalDateTime> tempoDosInvestimentos = new ArrayList<LocalDateTime>();
    double valor;
    private LocalDateTime agora;
    private long duration;
    private int nInvestimento;


    Scanner sc = new Scanner(System.in);

    public LocalDateTime investir(){
        System.out.println("Digite o valor a ser investido");
        valor = sc.nextDouble();
        nInvestimentos.add(valor);
        agora= LocalDateTime.now();
        tempoDosInvestimentos.add(agora);
        return agora;
    }

    public double retirarInvestimento(){
        duration = Duration.between(agora, LocalDateTime.now()).toSeconds();
        valor = valor*1.2*(duration/2);
        if(duration>90){
            valor = 0;
        }
        return valor;
    }
}
