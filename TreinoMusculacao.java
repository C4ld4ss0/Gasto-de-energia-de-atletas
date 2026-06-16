
public class TreinoMusculacao implements Treinamento{
    private int pesoTotalLevantado;
    
    public TreinoMusculacao(int pesoTotalLevantado){
        this.pesoTotalLevantado = pesoTotalLevantado;
    }
    
    @Override
    public int calcularGasto (Corpo corp){
        double custo = (pesoTotalLevantado * 0.05) * corp.getMultiplicadorGasto();
        return (int) custo;
    }
}