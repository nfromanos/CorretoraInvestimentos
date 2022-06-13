package dominios;
import serviços.CalcularInvestimento;

import java.time.LocalTime;

public class Investimento extends Client {

    private final TiposDeInvestimento tipoDoInvestimento;
    private double quantidadeInvestida;
    private final LocalTime tempoCompraInvestimento;
    private LocalTime tempoCompraOlhado;

    public Investimento(String name, String username, String password, Role role, String profile, TiposDeInvestimento tipoDoInvestimento, double quantidadeInvestida, LocalTime tempoCompraInvestimento, LocalTime tempoCompraOlhado) {
        super(name, username, password, role, profile);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
        this.tempoCompraInvestimento = tempoCompraInvestimento;
        this.tempoCompraOlhado = tempoCompraOlhado;
    }

    public Investimento(String username, TiposDeInvestimento tipoDoInvestimento, double quantidadeInvestida, LocalTime tempoCompraInvestimento, LocalTime tempoCompraOlhado) {
        super(username);
        this.tipoDoInvestimento = tipoDoInvestimento;
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

}
