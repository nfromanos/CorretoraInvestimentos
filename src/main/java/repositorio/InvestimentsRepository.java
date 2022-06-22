package repositorio;

import dominios.InvestimentoCliente;


import java.util.ArrayList;

public class InvestimentsRepository {

    public static final ArrayList<InvestimentoCliente> listaDeInvestimentos = new ArrayList<>();

    public static void addInvestimento(InvestimentoCliente investimento) {
        listaDeInvestimentos.add(investimento);
    }

}