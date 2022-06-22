package dominios;
import java.time.LocalTime;

public class InvestimentoCliente extends Client {

    private final TiposDeInvestimento tipoDoInvestimento;
    private final InvestimentoCorretora investimento;
    private double quantidadeInvestida;
    private final LocalTime tempoCompraInvestimento;
    private LocalTime tempoCompraOlhado;

    public InvestimentoCliente(String username, TiposDeInvestimento tipoDoInvestimento, InvestimentoCorretora investimento,double quantidadeInvestida, String profile, LocalTime tempoCompraInvestimento, LocalTime tempoCompraOlhado) {
        super(username, profile);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.investimento = investimento;
        this.quantidadeInvestida = quantidadeInvestida;
        this.tempoCompraInvestimento = tempoCompraInvestimento;
        this.tempoCompraOlhado = tempoCompraOlhado;
    }

    public LocalTime getTempoCompraOlhado() {
        return tempoCompraOlhado;
    }

    public void setTempoCompraOlhado(LocalTime tempoCompraOlhado) {
        this.tempoCompraOlhado = tempoCompraOlhado;
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

    public InvestimentoCorretora getInvestimento() {
        return investimento;
    }

}