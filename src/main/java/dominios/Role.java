package dominios;

public enum Role {
    NORMAL(1),
    ADMIN(2);

    private int cod;

    Role(int cod) {
        this.cod = cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }
}

