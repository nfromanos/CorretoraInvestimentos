package dominios;

public enum Role {
    NORMAL(1),
    ADMIN(2);

    private int cod;

    Role(int cod) {
        this.cod = cod;
    }

    public Role returnRole (int roleInt){
        if(roleInt == 2) {
            return Role.ADMIN;
        } else {
            return Role.NORMAL;
        }
    }

    public int getCod() {
        return cod;
    }
}