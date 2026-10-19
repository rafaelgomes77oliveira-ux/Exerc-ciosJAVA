public class App {
    public void main(){
        Hora hora = new Hora(10,20,30);
        DiaDeTrabalho day = new DiaDeTrabalho(hora);
        IO.println(day.toString());
    }
}
