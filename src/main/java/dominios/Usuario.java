package dominios;

public class Usuario {

    protected String nome;
    protected String sobrenome;
    protected String usuario;
    protected String senha;

    public Usuario(String nome, String sobrenome, String usuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
