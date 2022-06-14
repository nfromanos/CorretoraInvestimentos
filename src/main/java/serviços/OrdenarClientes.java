package serviços;

import dominios.Client;

import java.util.Collections;
import java.util.Comparator;
import static repositorio.ClientRepository.listaDeClientes;

public class OrdenarClientes {
    public void ordernacao(){
    Collections.sort(listaDeClientes, new Comparator<Client>(){
        @Override
        public int compare(Client o1, Client o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    }
}