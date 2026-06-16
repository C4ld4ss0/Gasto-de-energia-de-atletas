
public class TreinoFutebol implements Treinamento{
    private double tempoJogo;
    private PosFutebol posicao;
    private int gol;
    private boolean climaQuente;
    
    public TreinoFutebol(double tempoJogo, PosFutebol posicao, int gol, boolean climaQuente){
        this.tempoJogo = tempoJogo;
        this.posicao = posicao;
        this.gol = gol;
        this.climaQuente = climaQuente;
    }
    
    @Override
    public int calcularGasto(Corpo corpo){
        double custo = this.tempoJogo * this.posicao.getGastoPorMinuto();
        if(this.climaQuente){custo *= 1.2;}
        custo += (this.gol * 5);
        custo *= corpo.getMultiplicadorGasto();
        return (int) custo;
    }
    
}