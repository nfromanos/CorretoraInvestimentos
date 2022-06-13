package repositorio;
import dominios.Client;
import java.util.ArrayList;

public class ClientRepository{
    public static final ArrayList<Client> listaDeClientes = new ArrayList<>();
    public static void AddCliente(Client cliente){
        listaDeClientes.add(cliente);
    }

    public static void RemovCliente(Client cliente){
        listaDeClientes.remove(cliente);
    }

}