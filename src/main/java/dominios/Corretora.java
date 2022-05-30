package dominios;

public class Corretora extends User {
    public String name;

    public Corretora (String name, String username, String password, Role role) {
        super(username, password, role);
        this.id = generateId();
        this.name = name;
    }

}
