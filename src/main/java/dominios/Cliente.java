package dominios;

import sun.jvmstat.perfdata.monitor.protocol.local.PerfDataFile;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private final String inscricao;
    private final PerfilInvestimentos perfilEnum;

    public Cliente(String nome, String sobrenome, String login, String senha, String inscricao, PerfilInvestimentos perfilEnum) {
        super(nome, sobrenome, login, senha);
        this.inscricao = inscricao;
        this.perfilEnum = perfilEnum;
    }

    public String getInscricao() {
        return inscricao;
    }

}