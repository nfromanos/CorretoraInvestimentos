package dominios;

public enum PerfilInvestimentos {
    CONSERVADOR(1),
    MODERADO(2),
    AGRESSIVO(3);

    private final int pontuacao;

    PerfilInvestimentos(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
