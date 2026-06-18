
public class TreinoAtletismo implements Treinamento{
    private double distanciaKm;
    private double tempoMinuto;
    private TerrenoCorrida terreno;
    private boolean climaQuente;

    TreinoAtletismo(double distanciaKm, double tempoMinuto, TerrenoCorrida terreno, boolean climaQuente){
        this.distanciaKm = distanciaKm;
        this.tempoMinuto = tempoMinuto;
        this.terreno = terreno;
        this.climaQuente = climaQuente;]
    }
    @Override
    public int calcularGato(Corpo corpo){
        double pace = this.tempoMinuto/this.distanciaKm;

        double gastoPace = 1.0;
        if(pace <= 4.5){
            gastoPace = 1.5;
        }else if(pace > 4.5 && pace <= 6.0){
            gastoPace = 1.2;
        }else{
            gastoPace = 0.9;
        }

        double custo = (this.distancia * 15) * this.terreno.getDificuldade() * fatorPace;
        if(this.climaQuente){
            custo *= 1.25;
        }
        return (int) (custo * corpo.getMultiplicadorGasto());
    }
}
