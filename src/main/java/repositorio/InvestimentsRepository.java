package repositorio;

import dominios.CalcularInvestimento;
import dominios.Client;
import dominios.TiposDeInvestimento;
import telas.MenuInveste;


import java.time.LocalTime;
import java.util.ArrayList;

public class InvestimentsRepository extends Client {

    public static final ArrayList<InvestimentsRepository> listaDeInvestimentos = new ArrayList<>();
    private final TiposDeInvestimento tipoDoInvestimento;
    private double quantidadeInvestida;
    private final LocalTime TEMPO_COMPRA_INVESTIMENTO;
    private LocalTime tempoCompraOlhado;
    public InvestimentsRepository(String username, TiposDeInvestimento tipoDoInvestimento, double quantidadeInvestida, LocalTime tempoCompraInvestimento, LocalTime tempoCompraOlhado){
        super(username);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
        this.TEMPO_COMPRA_INVESTIMENTO = tempoCompraInvestimento;
        this.tempoCompraOlhado = tempoCompraOlhado;
    }

    public LocalTime getTempoCompraOlhado() {
        return tempoCompraOlhado;
    }

    public void setTempoCompraOlhado(LocalTime tempoCompraOlhado) {
        this.tempoCompraOlhado = tempoCompraOlhado;
    }

    public static void getListaDeInvestimentosDosClientes() {
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida());
        }
    }

    public static void consultarInvestimentosDoCliente(Client cliente) {
        MenuInveste menuInveste = new MenuInveste();
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            if (investimentsRepository.getUsername().equals(cliente.getUsername())) {
                investimentsRepository.ajusteValorInvestimento(investimentsRepository, cliente);
                System.out.printf("%nLogin:%s Investimento:%s Quantidade:%.2f Hora da Compra:%s%n", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida(), investimentsRepository.getTEMPO_COMPRA_INVESTIMENTO());
            }
        }
    }
    public void ajusteValorInvestimento(InvestimentsRepository investimento, Client cliente){
        CalcularInvestimento investe = new CalcularInvestimento();
        MenuInveste menuInveste = new MenuInveste();
        this.quantidadeInvestida = investe.calculoValorDeRetirada(investimento, cliente);
    }

    public static void addInvestimento(InvestimentsRepository investimento) {
        listaDeInvestimentos.add(investimento);
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

    public void setQuantidadeInvestida(double quantidadeInvestida) {
        this.quantidadeInvestida = quantidadeInvestida;
    }

    public LocalTime getTEMPO_COMPRA_INVESTIMENTO() {
        return TEMPO_COMPRA_INVESTIMENTO;
    }


    @Override
    public String getUsername() {
        return username;
    }
}