import java.util.LinkedList;
import java.util.List;

public abstract class Trabalhador {
    protected List<DiaDeTrabalho> diasTrabalhados = new LinkedList<DiaDeTrabalho>();
    protected String nome;
    protected ETrabalho classe;
    protected int saldoMinutos;

    protected Trabalhador(String name){
        this.nome = name;
    }

    protected abstract void adicionarDiaTrabalhado(DiaDeTrabalho dia);

}
