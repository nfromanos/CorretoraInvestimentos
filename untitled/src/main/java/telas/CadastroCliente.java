package telas;
import dominios.Cliente;
import repositorio.ClientRepository;

import java.util.Scanner;

public class CadastroCliente {
    public void criar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o seu nome:");
        String nome = scanner.next();
        System.out.println("Entre o seu sobrenome:");
        String sobrenome = scanner.next();
        System.out.println("Entre o seu CPF ou CNPJ:");
        String inscricao = scanner.next();
        System.out.println("Entre o login:");
        String login = scanner.next();
        System.out.println("Entre a senha:");
        String senha = scanner.next();


        Cliente cliente = new Cliente(nome, sobrenome, login, senha, inscricao);
        ClientRepository.AddCliente(cliente);

        Cliente cliente1 = new Cliente("a", "a1", "a2", "a3", "1111");
        ClientRepository.AddCliente(cliente1);
        Cliente cliente2 = new Cliente("b", "b1", "b2", "b3", "2222");
        ClientRepository.AddCliente(cliente2);

        ClientRepository.getListaDeClientes();
    }
}
