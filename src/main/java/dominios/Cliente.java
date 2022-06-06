package dominios;


import repositorio.ClientRepository;

import java.util.ArrayList;

public class Cliente extends User implements AcessosUsuario {
    private String name;
    private String profile;

    public Cliente(String name, String username, String password, Role role, String profile) {
        super(username, password, role);
        this.name = name;
        this.id = generateId();
        this.profile = returnProfile(profile);

    }
    public Cliente(String username) {
        super(username);
    }

    public Cliente(){
    }

    @Override
    public String returnProfile(String profileString) {
        int profileInt = Integer.parseInt(profileString);
        if (profileInt == 3) {
            return "AGRESSIVO";
        } else if (profileInt == 2) {
            return "MODERADO";
        } else {
            return "CONSERVADOR";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getProfile() {
        return profile;
    }

    @Override
    protected int generateId () {
        ArrayList<Cliente> clientsList = ClientRepository.listaDeClientes;
        int sizeClientsList = clientsList.size();
        int id = sizeClientsList + 1;
        return id;
    }

}