package repositorio;
import dominios.Cliente;
import java.util.ArrayList;

public class ClientRepository{
    public static final ArrayList<Cliente> listaDeClientes = new ArrayList<>();


    public static void getListaDeClientes(){
        for (Cliente listaDeCliente : listaDeClientes) {
            System.out.printf("%nNome:%s Sobrenome:%s Inscrição:%s Usuário:%s%n", listaDeCliente.getName(),  listaDeCliente.getUsername(), listaDeCliente.getPassword());
        }
    }
    public static void AddCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }



}
;