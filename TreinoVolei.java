
public class TreinoVolei implements Treinamento
{
    private int quantidadeSets;
    private PosVolei posicao;
    
    public TreinoVolei(int quantidadeSets, PosVolei posicao){
        this.quantidadeSets = quantidadeSets;
        this.posicao = posicao;
    }

    @Override
    public int calcularGasto(Corpo corpo){
        double custoBruto = this.posicao.getGastoEnergiaPosicao() * this.quantidadeSets;
        return (int) (custoBruto * corpo.getMultiplicadorGasto());
    }
    
}
