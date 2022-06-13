package telas.consultas;
import dominios.Client;
import dominios.Investimento;
import serviços.AtualizarValorDoInvestimento;

import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ConsultarInvestimentosDoCliente {
    public static void consultarInvestimentosDoCliente(Client cliente) {
        for (Investimento investimento : listaDeInvestimentos) {
            if (investimento.getUsername().equals(cliente.getUsername())) {
                AtualizarValorDoInvestimento atualizar = new AtualizarValorDoInvestimento();
                atualizar.ajusteValorInvestimento(investimento, cliente);
                System.out.printf("%nLogin:%s Investimento:%s Quantidade:%.2f Hora da Compra:%s%n", investimento.getUsername(), investimento.getTipoDoInvestimento(), investimento.getQuantidadeInvestida(), investimento.getTempoCompraInvestimento());
            }
        }
    }
}
