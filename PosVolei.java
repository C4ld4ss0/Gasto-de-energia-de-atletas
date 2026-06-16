
public enum PosVolei
{
    PONTEIRO(30),
    OPOSTO(30),
    LIBERO(15),
    CENTRAL(20),
    LEVANTADOR(35);
    
    private int gastoEnergiaPosicao;
    
    PosVolei(int gasto){
        this.gastoEnergiaPosicao = gasto;
    }
    public int getGastoEnergiaPosicao(){
        return this.gastoEnergiaPosicao;
    }
    
}