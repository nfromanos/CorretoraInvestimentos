package telas;
import dominios.Client;
import java.util.Scanner;
import static repositorio.ClientRepository.listaDeClientes;

public class LoginCliente {

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
                PainelCliente.acessar(scanner, usuario);
            }
        }
        if(usuarioEncontrado == 0){
            System.out.println("Usuário não encontrado.");
        }

    }


}