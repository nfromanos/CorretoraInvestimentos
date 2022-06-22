package dominios;
import java.util.ArrayList;

public enum TiposDeInvestimento {
    ACAO(new ArrayList<>()),
    TESOURO(new ArrayList<>()),
    FUNDOS(new ArrayList<>());

    private final ArrayList<InvestimentoCorretora> tipos;

    TiposDeInvestimento(ArrayList<InvestimentoCorretora> tipos) {
        this.tipos = tipos;
    }

    public ArrayList<InvestimentoCorretora> getTipos() {
        return tipos;
    }
}