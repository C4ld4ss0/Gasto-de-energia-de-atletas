
public class TreinoBasquete implements Treinamento{
    private double tempoJogo;
    private PosBasquete posicao;
    private int rebotes;
    private boolean jogoMeiaQuadra;
    
    public TreinoBasquete(double tempoJogo, PosBasquete posicao, int rebotes, boolean jogoMeiaQuadra){
        this.tempoJogo = tempoJogo;
        this.posicao = posicao;
        this.rebotes = rebotes;
        this.jogoMeiaQuadra = jogoMeiaQuadra;        
    }
    
    @Override
    public int calcularGasto(Corpo corpo){
        double custo = this.tempoJogo * this.posicao.getGastoPorMinuto();
        
        if(this.jogoMeiaQuadra){custo *= 1.3;}
        
        double custoFinal = (custo + (this.rebotes * 2))* corpo.getMultiplicadorGasto();
        
        return (int) custoFinal;
    }
    
    
    
}