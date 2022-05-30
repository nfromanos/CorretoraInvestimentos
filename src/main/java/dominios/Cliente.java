package dominios;


public class Cliente extends Usuario {

    private final String inscricao;
    private final String perfil;

    public Cliente(String nome, String sobrenome, String login, String senha, String inscricao, String perfil) {
        super(nome, sobrenome, login, senha);
        this.inscricao = inscricao;
        this.perfil = perfil;
    }

    public String getInscricao() {
        return inscricao;
    }

    public String getPerfil() {
        return perfil;
    }
}