package dominios;

public abstract class User{
    protected int id;
    protected String username;
    protected String password;
    protected Role role;

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

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    protected abstract int generateId ();

    public int getId() {
        return id;
    }


}