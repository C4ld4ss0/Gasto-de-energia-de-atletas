
public class TreinoHandebol implements Treinamento{
    private double tempoJogo;
    private posHandebol posicao;
    private int golsMarcados;
    private boolean partidaOficial;

    public TreinoHandebol (double tempoJogo, posHandebol posicao, int golsMarcados, boolean partidaOficial){
        this.tempoJogo = tempoJogo;
        this.posicao = posicao;
        this.golsMarcados = golsMarcados;
        this.partidaOficial = partidaOficial;
    }
    
    @Override
    public int calcularGasto(Corpo corpo){
        double intensidade = 1.0;
        if(this.partidaOficial){multiplicadorIntensidade = 1.3;}
        double custoTempo = this.tempoJogo * this.posicao.getGastoPorMinuto() * intensidade;
        custoTempo += this.golsMarcados * 3;

        return (int) (custoBruto * corpo.getMultiplicadorGasto());
    }
}
