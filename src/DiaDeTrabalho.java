import java.time.LocalDate;

public class DiaDeTrabalho {

    LocalDate data;
    Hora entrada, saida;
    ETrabalho classe;
    protected int jornadaPadrao;
    double saldoMinutos;

    public DiaDeTrabalho(Hora entrada, ETrabalho classe){
        this.entrada = entrada;
        jornadaPadrao = classe.jornada();
    }

    public boolean registrarSaida(Hora saiu){
        boolean erro = true;
        
        if(saiu != null){
            saida = saiu;
            erro = false;
        }
        
        return !erro;
    }

    public String toString() {
        return entrada.toString();
        
    }
    


}
