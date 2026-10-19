public class Hora {
    int horas,minutos,segundos;
    public Hora(int hora, int minuto, int segundo){
        horas = hora;
        minutos = minuto;
        segundos = segundo;
    }
    @Override
    public String toString() {
        return String.format("Hora: %d, minutos %d, segundos: %d",horas,minutos,segundos);
    }
}
