package telas.consultas;
import dominios.TiposDeInvestimento;

public class ConsultarTodosOsAtivos implements ConsultaGeral {

    @Override
    public void consultar(){
        System.out.printf("Tipo:%s%nAtivos:%s%n%nTipo:%s%nAtivos:%s%n%nTipo:%s%nAtivos:%s%n%n", TiposDeInvestimento.ACAO, TiposDeInvestimento.ACAO.getTipos(), TiposDeInvestimento.TESOURO, TiposDeInvestimento.TESOURO.getTipos(), TiposDeInvestimento.FUNDOS, TiposDeInvestimento.FUNDOS.getTipos());
    }

}
