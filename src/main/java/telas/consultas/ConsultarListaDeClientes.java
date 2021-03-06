package telas.consultas;
import static repositorio.ClientRepository.listaDeClientes;

import dominios.Client;

public class ConsultarListaDeClientes {
    public static void getListaDeClientes(){
        for(Client listaDeCliente : listaDeClientes) {
            System.out.printf("%nId:%s Nome:%s Login:%s Perfil:%s%n", listaDeCliente.getId(), listaDeCliente.getName(),
                    listaDeCliente.getUsername(),  listaDeCliente.getProfile());
        }
    }
}
