package dominios;
import java.util.ArrayList;

public class Corretora extends Usuario{

    private final int identificador;

    private ArrayList<Corretora> listaDeAdministradores;

    public Corretora(String nome, String sobrenome, String usuario, String senha, int identificador) {
        super(nome, sobrenome, usuario, senha);
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

}
