public class Clt extends Trabalhador {

    static final int HORARIO_INICIO_MIN = 450; // 7:30 AM
    static final int HORA_EXTRA_MAX = 120; // 2:00h
    static final int HORA_EXTRA_VALOR = 2;

    public Clt(){
        super("Jonh");
        classe = ETrabalho.CLT;
    }

    @Override
    public void adicionarDiaTrabalhado(DiaDeTrabalho dia){
        diasTrabalhados.add(dia);
    }


}
