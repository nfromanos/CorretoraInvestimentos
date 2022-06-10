package dominios;
import repositorio.InvestimentsRepository;
import java.util.Scanner;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class RetirarInvestimento {

    public void retirarInvestimento(Scanner scanner, Client usuario){
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
}
