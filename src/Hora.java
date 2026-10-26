public class Hora {

    int horas,minutos,segundos;
    static final int horaEmSegundos = 3600;
    static final int minutoEmSegundos = 60;

    public Hora(int hora, int minuto, int segundo){

        validarHora(hora, minuto, segundo);
            this.horas = hora;
            this.minutos = minuto;
            this.segundos = segundo;
    }

    private void validarHora(int hora, int minuto, int segundo){

        if(hora < 0 || minuto < 0 || segundo < 0){
            throw new IllegalArgumentException("valor negativo");
        }
        if(hora >= 24 && minuto >= 60 && segundo >= 60){
            throw new IllegalArgumentException("valor excede o formato máximo 24:59:59");
        }
    }

    private int transformarEmSegundos(){
        int segundosTotais = segundos;
        segundosTotais += minutos * minutoEmSegundos;
        return segundosTotais += horas * horaEmSegundos;
    }

    public void incrementar(int minuto){
        int atual = transformarEmSegundos();
        int incrementoSegundos = minuto * minutoEmSegundos;
        atual += incrementoSegundos;
        if(atual > 86399){
            throw new IllegalStateException();
        }
        horas = atual/horaEmSegundos;
        minutos = (atual/minutoEmSegundos - (horaEmSegundos*horas));
        validarHora(horas,minutos,segundos);

    }

    public int diferencaEmMinutos(Hora outra){
        int Minutos = transformarEmSegundos();
        int OutroMinutos = outra.transformarEmSegundos();
        int diferenca = (Minutos - OutroMinutos)/minutoEmSegundos;
        if (minutos < 0){
            minutos *= -1;
        }
        
        return diferenca;
    }

    public boolean estaNaFrente(Hora outra){
        return outra.transformarEmSegundos() < transformarEmSegundos();
        
    }

    @Override
    public String toString() {
        return String.format("Hora: %d, minutos %d, segundos: %d",horas,minutos,segundos);
    }
}
