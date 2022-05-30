package telas;
import dominios.Cliente;
import dominios.Role;
import repositorio.ClientRepository;
import java.util.Scanner;

public class CadastroCliente {
    public void criar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o seu nome:");
        String name = scanner.next();
        System.out.println("Entre o seu login:");
        String login = scanner.next();
        System.out.println("Entre a senha:");
        String password = scanner.next();
        System.out.println("Entre o seu perfil de investidor\n1 - CONSERVADOR\n2 - MODERADO\n3 - AGRESSIVO");
        String profile = scanner.next();
        Cliente cliente = new Cliente(name, login, password, Role.NORMAL.returnRole(1), profile);
        ClientRepository.AddCliente(cliente);
        ClientRepository.getListaDeClientes();
    }
}
