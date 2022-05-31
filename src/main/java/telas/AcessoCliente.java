package telas;
import dominios.Cliente;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;
import telas.Menu;
import dominios.Investe;
import java.time.LocalDateTime;
import java.util.Scanner;
import static repositorio.ClientRepository.listaDeClientes;

public class AcessoCliente {
    double quantidadeDoAtivo;
    public void logar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o seu login:");
        String login = scanner.next();
        System.out.println("Entre a sua senha:");
        String senha = scanner.next();
        String perfil = "1";

        for (Cliente usuario : listaDeClientes) {
            if(usuario.getUsername().equals(login) && usuario.getPassword().equals(senha)){
                System.out.println("Usuário encontrado, entre a opção desejada:\n1 - Investir\n2 - Retirar investimento\n3 - Acompanhar os investimentos\n4 - Ver tipos de investimentos");
                switch(scanner.next()){
                    case "1":
                        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", usuario.returnProfile(perfil));
                        String opcaoDeInvestimentoSelecionado = scanner.next().toUpperCase();

                        break;
                    case "2":
                    case "3":
                    case "4":
                        for(TiposDeInvestimento investimento : TiposDeInvestimento.values()){
                            System.out.println(investimento);
                        }
                }
            }
        }
    }
}
