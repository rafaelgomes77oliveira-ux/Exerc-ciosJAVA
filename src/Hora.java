public class Hora {

    int horas,minutos,segundos;

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
        segundosTotais += minutos * 60;
        return segundosTotais += horas * 3600;
    }

    public void incrementar(int minuto){
        int atual = transformarEmSegundos();
        int incrementoSegundos = minuto * 60;
        atual += incrementoSegundos;
        if(atual > 86399){
            throw new IllegalStateException();
        }
        horas = atual/3600;
        minutos = (atual/60 - (3600*horas));
        validarHora(horas,minutos,segundos);

    }

    public int diferencaEmMinutos(Hora outra){
        int Minutos = transformarEmSegundos()/60;
        int OutroMinutos = outra.transformarEmSegundos()/60;
        int diferenca = Minutos - OutroMinutos;
        if (minutos < 0){
            minutos += -1;
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
