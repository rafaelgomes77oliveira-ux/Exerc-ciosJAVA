public enum ETrabalho {
    CLT(480),
    PJ(Integer.MAX_VALUE),
    PLANTONISTA(820),
    ESCRAVO(Integer.MAX_VALUE);

    private int jornadaPadrao;
    
    ETrabalho(int jornada){
        jornadaPadrao = jornada;
    }

    public int jornada(){
        return jornadaPadrao;
    }
}
