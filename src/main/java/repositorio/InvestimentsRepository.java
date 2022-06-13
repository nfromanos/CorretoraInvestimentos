package repositorio;

import dominios.Investimento;


import java.util.ArrayList;

public class InvestimentsRepository {

    public static final ArrayList<Investimento> listaDeInvestimentos = new ArrayList<>();

    public static void addInvestimento(Investimento investimento) {
        listaDeInvestimentos.add(investimento);
    }

}