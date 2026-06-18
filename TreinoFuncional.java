
public class TreinoFuncional implements Treinamento{
    private double tempoTreino;
    private NivelFuncional nivel;
    private boolean usaPesos
    
    public TreinoFuncional (double tempoTreino, NivelFuncional nivel, boolean usaPesos){
        this.tempoTreino = tempoTreino;
        this.nivel = nivel;
        this.usaPesos = usaPeesos;
    }
    @Override
    public int calcularGasto(Corpo corpo){
        double custo = this.tempoTreino * 1.5 * this.nivel.getGastoBase();
        if(this.usaPesos){
            custo *= 1.2;
        }
        return (int) (custo * corpo.getMultiplicadorGasto());
    }
}
