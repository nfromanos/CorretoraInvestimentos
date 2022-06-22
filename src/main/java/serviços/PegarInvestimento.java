package serviços;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;

public class PegarInvestimento {

    public static InvestimentoCorretora pegarInvestimento(String tipoDeInvestimentoEscolhido, String ativoEscolhido){
        InvestimentoCorretora investimentoSelecionado = null;
        for (InvestimentoCorretora investimento : TiposDeInvestimento.valueOf(tipoDeInvestimentoEscolhido).getTipos()) {
            if (investimento.getNomeDoInvestimento().equals(ativoEscolhido)){
                investimentoSelecionado = investimento;
            }
        }
        return investimentoSelecionado;
    }

}
