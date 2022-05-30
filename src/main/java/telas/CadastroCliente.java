package telas;
import dominios.Cliente;
import repositorio.ClientRepository;

import java.util.Scanner;

public class CadastroCliente {
    public void criar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o seu nome:");
        String name = scanner.next();
        System.out.println("Entre o seu sobrenome:");
        String username = scanner.next();
        System.out.println("Entre o seu CPF ou CNPJ:");
        String inscricao = scanner.next();
        System.out.println("Entre o seu perfil de investidor\n1 - CONSERVADOR\n2 - MODERADO\n3 - AGRESSIVO");
        String perfil = scanner.next();
        System.out.println("Entre o login:");
        String login = scanner.next();
        System.out.println("Entre a senha:");
        String senha = scanner.next();

        Cliente cliente = new Cliente();
        ClientRepository.AddCliente(cliente);

        ClientRepository.getListaDeClientes();
    }
}
