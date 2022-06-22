package Factorys;

import dominios.Client;
import dominios.Role;
import repositorio.ClientRepository;

public class FactoryClient {

    public static void factoryCliente(String name, String login, String password, Role role, String perfilDoInvestidor){
        Client cliente = new Client(name, login, password, Role.NORMAL.returnRole(1), perfilDoInvestidor);
        ClientRepository.addCliente(cliente);

    }

}
