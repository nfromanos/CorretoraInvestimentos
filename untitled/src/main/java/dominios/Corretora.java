package dominios;

public class Corretora extends Usuario{

    private int identificador;

    public Corretora(String nome, String sobrenome, String usuario, String senha, int identificador) {
        super(nome, sobrenome, usuario, senha);
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }
}
