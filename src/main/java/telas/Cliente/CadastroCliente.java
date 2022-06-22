package telas.Cliente;
import dominios.Client;
import dominios.Role;
import repositorio.ClientRepository;
import telas.consultas.ConsultarListaDeClientes;

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

        if(password.equals("SouAdmin")){
            Client cliente = new Client(name, login, password, Role.ADMIN.returnRole(2), "4");
            ClientRepository.AddCliente(cliente);
        }else {
            System.out.println("Entre o seu perfil de investidor\n" +
                    "\t1 - CONSERVADOR\n" +
                    "\t2 - MODERADO\n" +
                    "\t3 - AGRESSIVO");
            String perfilDoInvestidor = scanner.next();
            Client cliente = new Client(name, login, password, Role.NORMAL.returnRole(1), perfilDoInvestidor);
            ClientRepository.AddCliente(cliente);
        }
        //Validacao temporaria
        ConsultarListaDeClientes consultar = new ConsultarListaDeClientes();
        consultar.consultar();
    }
}