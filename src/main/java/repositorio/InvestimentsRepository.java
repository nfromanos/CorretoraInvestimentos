package repositorio;
import dominios.Cliente;
import dominios.TiposDeInvestimento;
import java.util.ArrayList;

public class InvestimentsRepository extends Cliente{

    public static final ArrayList<InvestimentsRepository> listaDeInvestimentos = new ArrayList<>();
    public String tipoDoInvestimento;
    public double quantidadeInvestida;

    public InvestimentsRepository(String nome, String sobrenome, String login, String senha, String inscricao, String perfil, String tipoDoInvestimento, double quantidadeInvestida) {
        super(nome, sobrenome, login, senha, inscricao, perfil);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
    }

    public String getTipoDoInvestimento() {
        return tipoDoInvestimento;
    }

    public double getQuantidadeInvestida() {
        return quantidadeInvestida;
    }

    public static void getListaDeInvestimentos(){
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimentsRepository.getLogin(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida());
        }
    }
    public static void addInvestimento(InvestimentsRepository investimento){
        listaDeInvestimentos.add(investimento);
    }

}
