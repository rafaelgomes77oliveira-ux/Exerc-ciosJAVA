import java.time.LocalDate;

public class DiaDeTrabalho {

    LocalDate data;
    Hora entrada, saida;
    static final double jornadaPadrao = 480;
    static final double Almoço = 60;
    double saldoMinutos;

    DiaDeTrabalho(Hora entrada){
        this.entrada = entrada;
    }
    public String toString() {
        return entrada.toString();
        
    }
    


}
