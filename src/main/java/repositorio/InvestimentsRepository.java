package repositorio;

import dominios.Cliente;
import dominios.Investe;
import dominios.Role;
import dominios.TiposDeInvestimento;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class InvestimentsRepository extends Cliente {

    public static final ArrayList<InvestimentsRepository> listaDeInvestimentos = new ArrayList<>();
    private final TiposDeInvestimento tipoDoInvestimento;
    private double quantidadeInvestida;
    private LocalTime tempoCompraInvestimento;
    private LocalTime tempoCompraOlhado;
    private double quantidadeDisponivel;
    public InvestimentsRepository(String username, TiposDeInvestimento tipoDoInvestimento, double quantidadeInvestida, LocalTime tempoCompraInvestimento, LocalTime tempoCompraOlhado){
        super(username);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
        this.tempoCompraInvestimento = tempoCompraInvestimento;
    }

    public LocalTime getTempoCompraOlhado() {
        return tempoCompraOlhado;
    }

    public void setTempoCompraOlhado(LocalTime tempoCompraOlhado) {
        this.tempoCompraOlhado = tempoCompraOlhado;
    }

    public double getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public static void getListaDeInvestimentosDosClientes() {
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida());
        }
    }

    public static void consultarInvestimentosDoCliente(Cliente cliente) {
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            if(investimentsRepository.getUsername().equals(cliente.getUsername())){
                investimentsRepository.ajusteValorInvestimento(investimentsRepository, cliente);
                System.out.printf("%nLogin:%s Investimento:%s Quantidade:%.2f Hora da Compra:%s%n", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida(), investimentsRepository.getTempoCompraInvestimento());
            }
        }
    }

    public void ajusteValorInvestimento(InvestimentsRepository investimento, Cliente cliente){
        Investe investe = new Investe();
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

    public LocalTime getTempoCompraInvestimento() {
        return tempoCompraInvestimento;
    }


    @Override
    public String getUsername() {
        return username;
    }
}