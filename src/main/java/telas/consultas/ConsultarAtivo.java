package telas.consultas;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;

public class ConsultarAtivo implements ConsultaUnica {

    @Override
    public void consultar(String nomeDoAtivo){
        for (TiposDeInvestimento investimento : TiposDeInvestimento.values()) {
            for (InvestimentoCorretora ativo : investimento.getTipos()) {
                if(ativo.getNomeDoInvestimento().equals(nomeDoAtivo)){
                    System.out.println(ativo);
                }
            }
        }
    }
}