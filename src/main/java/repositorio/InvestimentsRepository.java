package repositorio;

import dominios.Cliente;
import dominios.Role;
import dominios.TiposDeInvestimento;

import java.util.ArrayList;

public class InvestimentsRepository extends Cliente {

    public static final ArrayList<InvestimentsRepository> listaDeInvestimentos = new ArrayList<>();
    public String tipoDoInvestimento;
    public double quantidadeInvestida;

    public InvestimentsRepository(
            String name,
            String username,
            String password,
            String id,
            Role role,
            String profile,
            String tipoDoInvestimento,
            double quantidadeInvestida
    ) {
        super(name, username, password, role, profile);
        this.tipoDoInvestimento = tipoDoInvestimento;
        this.quantidadeInvestida = quantidadeInvestida;
    }


    public String getTipoDoInvestimento() {
        return tipoDoInvestimento;
    }

    public double getQuantidadeInvestida() {
        return quantidadeInvestida;
    }

    public static void getListaDeInvestimentos() {
        for (InvestimentsRepository investimentsRepository : listaDeInvestimentos) {
            System.out.printf("%nLogin:%s Investimento:%s Quantidade:%f", investimentsRepository.getUsername(), investimentsRepository.getTipoDoInvestimento(), investimentsRepository.getQuantidadeInvestida());
        }
    }

    public static void addInvestimento(InvestimentsRepository investimento) {
        listaDeInvestimentos.add(investimento);
    }

}
