package telas;
import dominios.Cliente;
import dominios.PerfilInvestimentos;
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
        System.out.println("Entre o seu perfil de investidor\nCONSERVADOR\nMODERADO\nAGRESSIVO");
        String perfil = scanner.next();
        PerfilInvestimentos perfilEnum = PerfilInvestimentos.valueOf(perfil);
        System.out.println("Entre o login:");
        String login = scanner.next();
        System.out.println("Entre a senha:");
        String senha = scanner.next();

        Cliente cliente = new Cliente(nome, sobrenome, login, senha, inscricao, perfilEnum);
        ClientRepository.AddCliente(cliente);

        ClientRepository.getListaDeClientes();
    }
}
