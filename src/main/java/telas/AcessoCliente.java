package telas;
import dominios.Cliente;
import dominios.TiposDeInvestimento;
import repositorio.InvestimentsRepository;
import dominios.Investe;

import java.util.Scanner;
import static repositorio.ClientRepository.listaDeClientes;

public class AcessoCliente {

    public void logar() {
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

    public void acessar(Scanner scanner, Cliente usuario) {
        do {
            Investe investe = new Investe();
            System.out.println("\nEntre a opção desejada:\n" +
                    "1 - Investir\n" +
                    "2 - Retirar investimento\n" +
                    "3 - Acompanhar os investimentos\n" +
                    "4 - Ver tipos de investimentos\n" +
                    "0 - Logoff");
            switch (scanner.next()) {
                case "1":
                    investe.investir(scanner, usuario);
                    break;
                case "2":
                    investe.retirarInvestimento(scanner, usuario);
                    break;
                case "3":
                    InvestimentsRepository.consultarInvestimentosDoCliente(usuario);
                case "4":

                    break;
                case "0":
                    return;
                default:
                    acessar(scanner, usuario);
            }

        } while (true);

    }
}