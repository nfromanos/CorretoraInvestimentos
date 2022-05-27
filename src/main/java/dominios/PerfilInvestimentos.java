package dominios;

public enum PerfilInvestimentos {
    CONSERVADOR(1),
    MODERADO(2),
    AGRESSIVO(3);

    private int pontuacao;

    PerfilInvestimentos(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
