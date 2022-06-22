package dominios;
import java.util.HashSet;

public enum TiposDeInvestimento {
    ACAO(new HashSet<>()),
    TESOURO(new HashSet<>()),
    FUNDOS(new HashSet<>());

    private final HashSet<InvestimentoCorretora> tipos;

    TiposDeInvestimento(HashSet<InvestimentoCorretora> tipos) {
        this.tipos = tipos;
    }

    public HashSet<InvestimentoCorretora> getTipos() {
        return tipos;
    }


}