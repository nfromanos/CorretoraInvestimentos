package dominios;
import repositorio.ClientRepository;
import java.util.ArrayList;

public class Client extends User implements AcessosUsuario {
    private String name;
    private String profile;

    public Client(String name, String username, String password, Role role, String profile) {
        super(username, password, role);
        this.name = name;
        this.id = generateId();
        this.profile = returnProfile(profile);

    }
    public Client(String username) {
        super(username);
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

    @Override
    public String getProfile() {
        return profile;
    }

    @Override
    protected int generateId () {
        ArrayList<Client> clientsList = ClientRepository.listaDeClientes;
        int sizeClientsList = clientsList.size();
        return id = sizeClientsList + 1;
    }


}