public enum ETrabalho {
    CLT(8),
    PJ(Integer.MAX_VALUE),
    PLANTONISTA(12);

    private int jornadaPadrao;
    
    ETrabalho(int jornada){
        jornadaPadrao = jornada;
    }

    public int jornada(){
        return jornadaPadrao;
    }
}
