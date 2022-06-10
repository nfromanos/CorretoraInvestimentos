package telas;
import dominios.Client;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;
import dominios.RealizarInvestimento;

import java.util.Arrays;
import java.util.Scanner;
import static repositorio.ClientRepository.listaDeClientes;

public class AcessoCliente {

    public void logar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o seu login:");
        String login = scanner.next();
        System.out.println("Entre a sua senha:");
        String senha = scanner.next();
        int usuarioEncontrado = 0;

        for (Client usuario : listaDeClientes) {
            if (usuario.getUsername().equals(login) && usuario.getPassword().equals(senha)) {
                System.out.println("Usuário encontrado");
                usuarioEncontrado = 1;
                acessar(scanner, usuario);
            }
            if(usuarioEncontrado == 0){
                System.out.println("Usuário não encontrado.");
            }
        }

    }

    public void acessar(Scanner scanner, Client usuario) {
        boolean flag = true;
        do {
            RealizarInvestimento investe = new RealizarInvestimento();
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Investir\n" +
                    "2 - Retirar investimento\n" +
                    "3 - Acompanhar os investimentos\n" +
                    "4 - Ver tipos de investimentos\n" +
                    "0 - Logoff");
            switch (scanner.next()) {
                case "1":
                    investe.investir(scanner, usuario, menuInveste);
                    break;
                case "2":
                    investe.retirarInvestimento(scanner, usuario);
                    break;
                case "3":
                    InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
                case "4":
                    System.out.println(Arrays.asList(TiposDeInvestimento.values()));;
                    break;
                case "0":
                    flag = false;
                    return;
                default:
                    acessar(scanner, usuario);
            }

        } while (flag);

    }
}