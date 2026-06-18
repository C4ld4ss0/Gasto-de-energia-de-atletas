
public enum PosVolei
{
    PONTEIRO(22.0),
    OPOSTO(25.0),
    LIBERO(20.0),
    CENTRAL(25.0),
    LEVANTADOR(30.0);
    
    private double gastoEnergiaPosicao;
    
    PosVolei(double gasto){
        this.gastoEnergiaPosicao = gasto;
    }
    public double getGastoEnergiaPosicao(){
        return this.gastoEnergiaPosicao;
    }
    
}
