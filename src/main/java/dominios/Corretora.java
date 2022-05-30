package dominios;

public class Corretora extends User {
    public String name;

    public Corretora (String username, String password, String role) {
        super(username, password, role);
        this.id = generateId();
        this.name = name;
    }

}
