import java.time.LocalDate;

public class App {
    public void main(){
        Hora hora = new Hora(10,20,30);
        LocalDate data = LocalDate.now();
        DiaDeTrabalho day = new DiaDeTrabalho(hora, ETrabalho.CLT, data);
        IO.println(day.toString());
    }
}
