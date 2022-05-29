package dominios;
import java.time.LocalDateTime;
import java.time.Duration;

public enum TiposDeInvestimento {
    ACAO(1.05),
    TESOURO(1.026),
    FUNDOS(1.03);

    private final double variacaoDoAtivo;
    private LocalDateTime agora;
    private Duration duration;

    public double getVariacaoDoAtivo() {
        return variacaoDoAtivo;
    }

    public void getTiposDeOpcoes(){
        for (TiposDeInvestimento tipo : TiposDeInvestimento.values()) {
            System.out.println(tipo);
        }
    }

    TiposDeInvestimento(double variacaoDoAtivo) {
        this.variacaoDoAtivo = variacaoDoAtivo;
//        this.agora = LocalDateTime.now();
    }

    TiposDeInvestimento(double variacaoDoAtivo, LocalDateTime agora) {
        this.variacaoDoAtivo = variacaoDoAtivo;
        this.duration = Duration.between(agora, LocalDateTime.now());
    }

}
