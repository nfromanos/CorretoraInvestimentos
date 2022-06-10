package repositorio;
import dominios.Client;
import java.util.ArrayList;
import static repositorio.InvestimentsRepository.listaDeInvestimentos;

public class ClientRepository{
    public static final ArrayList<Client> listaDeClientes = new ArrayList<>();


    public static void getListaDeClientes(){
        for (Client listaDeCliente : listaDeClientes) {
            System.out.printf("%nId:%s Nome:%s Login:%s Perfil:%s%n", listaDeCliente.getId(), listaDeCliente.getName(), listaDeCliente.getUsername(),  listaDeCliente.getProfile());

        }
        for (InvestimentsRepository investimentos : listaDeInvestimentos) {
            System.out.println("abc");
        }
    }
    public static void AddCliente(Client cliente){
        listaDeClientes.add(cliente);
    }

}