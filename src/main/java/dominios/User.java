package dominios;
import repositorio.ClientRepository;

import java.util.ArrayList;

public abstract class User{
    protected int id;
    protected String username;
    protected String password;
    protected Role role; // Transformar em ENUM

    protected User(String username, String password, Role role) {
        this.id = generateId();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    protected User(String username){
        this.username = username;
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

    protected int generateId () {
        ArrayList<Cliente> clientsList = ClientRepository.listaDeClientes;
        int sizeClientsList = clientsList.size();
        int id = sizeClientsList + 1;
        return id;
    }

    public int getId() {
        return id;
    }
}
