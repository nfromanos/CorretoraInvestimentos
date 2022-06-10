package repositorio;
import dominios.Client;
import java.util.ArrayList;

public class ClientRepository{
    public static final ArrayList<Client> listaDeClientes = new ArrayList<>();


    public static void getListaDeClientes(){
        for (Client listaDeCliente : listaDeClientes) {
            System.out.printf("%nId:%s Nome:%s Login:%s Perfil:%s%n", listaDeCliente.getId(), listaDeCliente.getName(), listaDeCliente.getUsername(),  listaDeCliente.getProfile());
        }
    }
    public static void AddCliente(Client cliente){
        listaDeClientes.add(cliente);
    }

}