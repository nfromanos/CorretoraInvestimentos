package dominios;
import repositorio.ClientRepository;

import java.util.ArrayList;

public class User {
    protected int id;
    protected String username;
    protected String password;
    protected Role role; // Transformar em ENUM

    public User(String username, String password, Role role) {
        this.id = generateId();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int generateId () {
        ArrayList<Cliente> clientsList = ClientRepository.listaDeClientes;
        int sizeClientsList = clientsList.size();
        int id = sizeClientsList + 1;
        return id;
    }
}
