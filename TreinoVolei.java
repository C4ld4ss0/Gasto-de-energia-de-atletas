
public class TreinoVolei implements Treinamento
{
    private String placar;
    private PosVolei posicao;
    
    public TreinoVolei(String placar, PosVolei posicao){
        this.placar = placar;
        this.posicao = posicao;
    }
    
    public int calcularGasto(Corpo corpo){
        double custo = this.posicao.getGastoEnergiaPosicao() * corpo.getMultiplicadorGasto();
        return (int) custo;
    }
    
}