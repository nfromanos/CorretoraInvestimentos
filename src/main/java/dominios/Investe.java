package dominios;
import repositorio.InvestimentsRepository;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import static repositorio.InvestimentsRepository.*;

public class Investe {

//    Tem que investir e retirar o investimento

    public void investir(Scanner scanner, Cliente usuario){
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado());
        System.out.println(Arrays.asList(TiposDeInvestimento.values()));
        String opcaoDeInvestimentoSelecionado = scanner.next().toUpperCase();
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        double quantidadeDoAtivo = scanner.nextDouble();
        InvestimentsRepository investimento = new InvestimentsRepository(usuario.getUsername(), TiposDeInvestimento.valueOf(opcaoDeInvestimentoSelecionado), quantidadeDoAtivo, LocalTime.now(), LocalTime.now());
        InvestimentsRepository.addInvestimento(investimento);
        InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
    }

    public void retirarInvestimento(Scanner scanner, Cliente usuario){
//        System.out.println("Qual investimento deseja retirar? Entrar ACAO, TESOURO ou FUNDOS.");
//        String investimentoEscolhido = scanner.next();
        InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
        System.out.printf("%nQuanto deseja retirar?%n");
        double quantidadeRetirada = scanner.nextDouble();
        for (InvestimentsRepository investimento : listaDeInvestimentos) {
            if(investimento.getUsername().equals(usuario.getUsername())){
                double quantidadeNova = investimento.getQuantidadeInvestida() - quantidadeRetirada;
                investimento.setQuantidadeInvestida(quantidadeNova);
                System.out.printf("%nQuantidade retirada no valor: %.2f%nSaldo Atual na Conta: %.2f%n", quantidadeRetirada, investimento.getQuantidadeInvestida());
            }
        }
    }

    public double calculoValorDeRetirada(InvestimentsRepository investimento, Cliente usuario){
        long diferencaDoTempoDaCompraEVendaDoInvestimento = Duration.between(investimento.getTempoCompraOlhado(), LocalTime.now()).toSeconds();
        investimento.setTempoCompraOlhado(LocalTime.now());
        String ativo = Profile.valueOf(usuario.getProfile()).getInvestimentoRecomendado();
        double varicaoDoInvestimento = TiposDeInvestimento.valueOf(ativo).getVariacaoDoAtivo();
        double valorDoInvestimento = investimento.getQuantidadeInvestida() * (Math.pow((varicaoDoInvestimento), diferencaDoTempoDaCompraEVendaDoInvestimento));
        if(Duration.between(investimento.getTempoCompraInvestimento(), LocalTime.now()).toSeconds() > 90){
            valorDoInvestimento = 0;
        }
        return valorDoInvestimento;
    }
}