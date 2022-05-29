package telas;
import dominios.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

import static repositorio.ClientRepository.listaDeClientes;

public class AcessoCliente {

    public void acessar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o seu login:");
        String login = scanner.next();
        System.out.println("Entre a sua senha:");
        String senha = scanner.next();

        for (Cliente usuario : listaDeClientes) {
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                System.out.println("Usuário encontrado, entre a opção desejada:");
            }
        }

    }


}
