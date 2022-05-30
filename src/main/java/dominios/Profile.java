package dominios;

public enum PerfilInvestimentos {
    CONSERVADOR("TESOURO"),
    MODERADO("FUNDOS"),
    AGRESSIVO("ACÃO");

    private final String investimentoRecomendado;

    PerfilInvestimentos(String pontuacao) {
        this.investimentoRecomendado = pontuacao;
    }

    public String getInvestimentoRecomendado() {
        return investimentoRecomendado;
    }
}
