package telas.consultas;
import dominios.Client;
import static repositorio.ClientRepository.listaDeClientes;

public class ConsultarClienteEspecifico implements ConsultarCliente {

    @Override
    public void consultar(String clienteSelecionadoUsername) {
        for (Client cliente : listaDeClientes) {
            if (clienteSelecionadoUsername.equals(cliente.getUsername())) {
                System.out.printf("%nId:%s Nome:%s Login:%s Perfil:%s%n", cliente.getId(), cliente.getName(),
                        cliente.getUsername(), cliente.getProfile());
            }
        }
    }
}
