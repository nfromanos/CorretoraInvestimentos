package Factorys;
import dominios.InvestimentoCorretora;
import dominios.TiposDeInvestimento;

public class FactoryTipoDeInvestimento {

    public static String criarInvestimento(String tipoDeInvestimentoSelecionado, String nomeDoInvestimentoSelecionado, double variacaoDoInvestimento){
        InvestimentoCorretora investimentoNovo = new InvestimentoCorretora(nomeDoInvestimentoSelecionado, variacaoDoInvestimento);
        TiposDeInvestimento.valueOf(tipoDeInvestimentoSelecionado).getTipos().add(investimentoNovo);
        return String.format("Investimento criado com sucesso.%nTipo do Investimento: %s%nNome do investimento: %s%n Variação do Investimento: %s", TiposDeInvestimento.valueOf(tipoDeInvestimentoSelecionado), investimentoNovo.getNomeDoInvestimento(), investimentoNovo.getVariacaoDoAtivo());
    }

}
