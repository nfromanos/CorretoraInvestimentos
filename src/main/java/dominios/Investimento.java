package dominios;
import java.util.Random;

public enum Investimento {
    ACAO(0.05),
    TESOURO(0.026),
    FUNDOS(0.02);

    private final double variacaoDoAtivo;

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    Investimento(double variacaoDoAtivo) {
        this.variacaoDoAtivo = variacaoDoAtivo;
    }
}
