package repositorio;

import dominios.Cliente;
import dominios.Role;
import dominios.TiposDeInvestimento;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;

public class InvestimentsRepository extends Cliente {

    private static final ArrayList<InvestimentsRepository> listaDeInvestimentos = new ArrayList<>();
    private TiposDeInvestimento tipoDoInvestimento;
    private double quantidadeInvestida;
    private LocalDateTime tempoInvestimento;
    private String username;
    private long tempoSaque;
    private double quantidadeDisponivel;

    public InvestimentsRepository(
            String name,
            String username,
            String password,
            String id,
            String teste,
            Role role,
            String profile,
            TiposDeInvestimento tipoDoInvestimento,
            double quantidadeInvestida
    ) {
        super(name, username, password, role, profile);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
    }


    public InvestimentsRepository(String username, TiposDeInvestimento tipoDoInvestimento, double quantidadeInvestida){
        super(username);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
        this.tempoInvestimento = LocalDateTime.now();
    }

    public InvestimentsRepository(String username, double quantidadeInvestida){
        super(username);
        this.quantidadeInvestida = quantidadeInvestida;
        this.quantidadeInvestida = getQuantidadeDisponivel();
    }

    public double consultarInvestimento(){
        tempoSaque = Duration.between(tempoInvestimento,LocalDateTime.now()).toSeconds();
        this.quantidadeDisponivel = quantidadeInvestida*1.2*(tempoSaque/2);
        if(tempoSaque >120){
            this.quantidadeInvestida = 0;
        }
        return quantidadeDisponivel;
    }

    public double getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public static void getListaDeInvestimentos() {
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida());
        }
    }

    public static void addInvestimento(InvestimentsRepository investimento) {
        listaDeInvestimentos.add(investimento);
    }

    public void setTipoDoInvestimento(TiposDeInvestimento tipoDoInvestimento) {
        this.tipoDoInvestimento = tipoDoInvestimento;
    }

    public void setQuantidadeInvestida(double quantidadeInvestida) {
        this.quantidadeInvestida = quantidadeInvestida;
    }

    public void setTempoInvestimento(LocalDateTime tempoInvestimento) {
        this.tempoInvestimento = tempoInvestimento;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public TiposDeInvestimento getTipoDoInvestimento() {
        return tipoDoInvestimento;
    }

    public double getQuantidadeInvestida() {
        return quantidadeInvestida;
    }

    public LocalDateTime getTempoInvestimento() {
        return tempoInvestimento;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
