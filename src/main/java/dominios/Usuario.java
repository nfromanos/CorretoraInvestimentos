package dominios;

public class Usuario {

    protected String nome;
    protected String sobrenome;
    protected String login;
    protected String senha;

    public Usuario(String nome, String sobrenome, String usuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.login = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
