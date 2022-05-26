package dominios;

public class Cliente extends Usuario {

    private int identificador;

    public Cliente(String nome, String sobrenome, String usuario, String senha, int identificador) {
        super(nome, sobrenome, usuario, senha);
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }
}