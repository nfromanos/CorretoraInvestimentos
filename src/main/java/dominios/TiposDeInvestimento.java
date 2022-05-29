package dominios;
import java.time.LocalDateTime;
import java.time.Duration;

public enum TiposDeInvestimento {
    ACAO(0.05),
    TESOURO(0.026),
    FUNDOS(0.03);

    private final double variacaoDoAtivo;
    private LocalDateTime agora;
    private Duration duration;

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    TiposDeInvestimento(double variacaoDoAtivo) {
        this.variacaoDoAtivo = variacaoDoAtivo;
        this.agora = LocalDateTime.now();
    }

    TiposDeInvestimento(double variacaoDoAtivo, LocalDateTime agora) {
        this.variacaoDoAtivo = variacaoDoAtivo;
        this.duration = Duration.between(agora, LocalDateTime.now());
    }

}
