package repositorio;
import dominios.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository{
    public static final List<Client> listaDeClientes = new ArrayList<>();
    public static void addCliente(Client cliente){
        listaDeClientes.add(cliente);
    }
    public static void removCliente(Client cliente){
        listaDeClientes.remove(cliente);
    }
}