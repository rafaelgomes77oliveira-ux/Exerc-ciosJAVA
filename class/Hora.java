public class Hora {
    int horas,minutos,segundos;
    Hora(int hora, int minuto, int segundo){
        horas = hora;
        minutos = minuto;
        segundos = segundo;

        
    }
    
    public String toString() {
        return String.format("Hora: %d, minutos %d, segundos: %d",horas,minutos,segundos);
    }
}
