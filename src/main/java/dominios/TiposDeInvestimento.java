package dominios;
import java.util.Collections;
import java.util.HashSet;

public enum TiposDeInvestimento {
    ACAO(new HashSet<>(Collections.singleton(new InvestimentoCorretora("PETRO", 1.006)))),
    TESOURO(new HashSet<>(Collections.singleton(new InvestimentoCorretora("SELIC", 1.005)))),
    FUNDOS(new HashSet<>(Collections.singleton(new InvestimentoCorretora("IMOB", 1.003))));

    private final HashSet<InvestimentoCorretora> tipos;

    TiposDeInvestimento(HashSet<InvestimentoCorretora> tipos) {
        this.tipos = tipos;
    }

    public HashSet<InvestimentoCorretora> getTipos() {
        return tipos;
    }
}