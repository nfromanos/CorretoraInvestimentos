package serviços;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;

public class PegarInvestimento {

    public static InvestimentoCorretora pegarInvestimento(String tipoDeInvestimentoEscolhido, String ativoEscolhido){
        for (InvestimentoCorretora investimento : TiposDeInvestimento.valueOf(tipoDeInvestimentoEscolhido).getTipos()) {
            if (investimento.getNomeDoInvestimento().equals(ativoEscolhido)){
                return investimento;
            }
        }
        return null;
    }

}
