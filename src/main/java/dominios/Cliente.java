package dominios;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private final String inscricao;

    public Cliente(String nome, String sobrenome, String usuario, String senha, String inscricao) {
        super(nome, sobrenome, usuario, senha);
        this.inscricao = inscricao;
    }

    public String getInscricao() {
        return inscricao;
    }



}