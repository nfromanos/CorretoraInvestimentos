package dominios;

public class InvestimentoCorretora {

    private final String nomeDoInvestimento;
    private final double variacaoDoAtivo;

    public InvestimentoCorretora(String nomeDoInvestimento, double variacaoDoAtivo) {
        this.nomeDoInvestimento = nomeDoInvestimento;
        this.variacaoDoAtivo = variacaoDoAtivo;
    }

    public String getNomeDoInvestimento() {
        return nomeDoInvestimento;
    }

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    @Override
    public String toString(){
        return String.format("Nome do Investimento: %s%nVariação do Ativo: %s", getNomeDoInvestimento(), getVariacaoDoAtivo());
    }
}
