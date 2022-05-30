package dominios;

public enum Profile {
    CONSERVADOR("TESOURO"),
    MODERADO("FUNDOS"),
    AGRESSIVO("ACÃO");

    private final String investimentoRecomendado;

    Profile(String pontuacao) {
        this.investimentoRecomendado = pontuacao;
    }

    public String getInvestimentoRecomendado() {
        return investimentoRecomendado;
    }


}
