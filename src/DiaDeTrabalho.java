import java.time.LocalDate;

public class DiaDeTrabalho {

    private LocalDate data;
    private Hora entrada, saida;
    private ETrabalho classe;
    private int jornadaPadrao;
    private int saldoMinutos;
    private boolean finalizado = false;

    public DiaDeTrabalho(Hora entrada, ETrabalho classe){
        this.entrada = entrada;
        jornadaPadrao = classe.jornada();
    }

    protected boolean registrarSaida(Hora saiu){
        if(saiu != null){
            saida = saiu;
            finalizado = true;
        }
        
        return finalizado;
    }

    public int saldoDeMinutos(){
        saldoMinutos = entrada.diferencaEmMinutos(saida);
        return saldoMinutos;
    }

    public String toString() {
        return entrada.toString();
    }
    


}
