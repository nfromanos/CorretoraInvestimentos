package dominios;

import java.time.LocalDateTime;
import java.time.Duration;

public enum TiposDeInvestimento {
    ACAO(1.05),
    TESOURO(1.026),
    FUNDOS(1.03);

    private final double variacaoDoAtivo;

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    TiposDeInvestimento(double variacaoDoAtivo) {
        this.variacaoDoAtivo = variacaoDoAtivo;
    }


}
