import java.time.LocalDate;

public class DiaDeTrabalho {

    public final LocalDate data;
    private Hora entrada, saida;
    private ETrabalho classe;
    private int jornadaPadrao;
    private int saldoMinutos;
    private boolean finalizado = false;

    public DiaDeTrabalho(Hora entrada, ETrabalho classe, LocalDate dia){
        this.entrada = entrada;
        this.jornadaPadrao = classe.jornada();
        this.data = dia;
    }

    public boolean registrarSaida(Hora saiu){
        if(saiu != null && finalizado == false){
            saida = saiu;
            finalizado = true;
        }
        
        return finalizado;
    }

    public int saldoDeMinutos(){
        if(!finalizado){
            throw new IllegalAccessError("Dia de trabalho não finalizado");
        }
        saldoMinutos = entrada.diferencaEmMinutos(saida);
        return saldoMinutos;
    }

    public String toString() {
        return String.format("DiaDeTrabalho\nSaldo De Minutos: %d\n finalizado: %b", saldoMinutos,finalizado);
    }
    


}
