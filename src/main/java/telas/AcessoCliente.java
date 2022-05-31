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

            for (Cliente usuario : listaDeClientes) {
                if (usuario.getUsername().equals(login) && usuario.getPassword().equals(senha)) {
                    System.out.println("Usuário encontrado");
                    acessar(scanner, usuario);

                } else {
                    System.out.println("Dados invalidos");
                }
            }
    }

    public void acessar(Scanner scanner, Cliente usuario){
        do {
        System.out.println("entre a opção desejada:\n" +
                "1 - Investir\n" +
                "2 - Retirar investimento\n" +
                "3 - Acompanhar os investimentos\n" +
                "4 - Ver tipos de investimentos\n" +
                "0 - Logoff");
            switch(scanner.next()){
            case "1":
                investir(scanner, usuario);
                break;
            case "2":
            case "3":
            case "4":
                for(TiposDeInvestimento rollDeInvestimentos : TiposDeInvestimento.values()){
                    System.out.println(rollDeInvestimentos);
                }
                break;
            case "0":
                return;
            default:
                acessar(scanner,usuario);
            }

        }while(true);

    }
    public void investir(Scanner scanner, Cliente usuario){
        System.out.printf("O investimento recomendado para o seu tipo de perfil é o(a) %s, qual das opções deseja adquirir:", usuario.getProfile());
        String opcaoDeInvestimentoSelecionado = scanner.next().toUpperCase();
        System.out.println("Qual a quantidade do ativo deseja comprar?");
        quantidadeDoAtivo = scanner.nextDouble();
        InvestimentsRepository investimento = new InvestimentsRepository(usuario.getUsername(), TiposDeInvestimento.valueOf(opcaoDeInvestimentoSelecionado), quantidadeDoAtivo);
        InvestimentsRepository.addInvestimento(investimento);
        agora[0] = LocalDateTime.now();
    }
    public LocalDateTime[] agora = new LocalDateTime[1];
}
