package repositorio;
import dominios.Cliente;
import java.util.ArrayList;

public class ClientRepository{
    public static final ArrayList<Cliente> listaDeClientes = new ArrayList<>();


    public static void getListaDeClientes(){
        for (Cliente listaDeCliente : listaDeClientes) {
            System.out.printf("%nNome:%s Sobrenome:%s Inscrição:%s Usuário:%s%n", listaDeCliente.getNome(), listaDeCliente.getSobrenome(), listaDeCliente.getInscricao(), listaDeCliente.getLogin());
        }
    }
    public static void AddCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }


}
