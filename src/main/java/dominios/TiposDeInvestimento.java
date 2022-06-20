package dominios;

public enum TiposDeInvestimento {
    ACAO(1.05, 2.5),
    TESOURO(1.04, 5.3),
    FUNDOS(1.03, 3.4);

    private final double variacaoDoAtivo;
    private final double valorDoAtivo;

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    TiposDeInvestimento(double variacaoDoAtivo, double valorDoAtivo) {
        this.variacaoDoAtivo = variacaoDoAtivo;
        this.valorDoAtivo = valorDoAtivo;

    }


}