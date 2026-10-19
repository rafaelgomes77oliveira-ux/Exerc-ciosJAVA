import java.time.LocalDate;

public class DiaDeTrabalho {

    LocalDate data;
    Hora entrada, saida;
    static final double jornadaPadrao = 480;
    static final double Almoço = 60;
    double saldoMinutos;

    public DiaDeTrabalho(Hora entrada){
        this.entrada = entrada;
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
