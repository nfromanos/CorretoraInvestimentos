package Factorys;
import dominios.Client;
import dominios.Role;
import repositorio.ClientRepository;

public class FactoryAdmin {

    public static void factoryAdmin(String name, String login, String password, Role role){
        Client cliente = new Client(name, login, password, role, "4");
        ClientRepository.addCliente(cliente);
    }

}
