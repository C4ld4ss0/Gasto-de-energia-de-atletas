
public class TreinoCorrida implements Treinamento{
    private double distanciaKm;
    private double pace;
    
    public TreinoCorrida(double distanciaKm, double pace){
        this.distanciaKm = distanciaKm;
        this.pace = pace;
    }
    
    @Override
    public int calcularGasto (Corpo corp){
        double custo= ((distanciaKm * 10) /pace) * corp.getMultiplicadorGasto();
        return (int) custo;
    }
}