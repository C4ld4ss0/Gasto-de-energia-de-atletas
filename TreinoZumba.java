
public class TreinoZumba implements Treinamento{
    private double tempoDanca;
    
    public TreinoZumba(double tempoDanca){
        this.tempoDanca = tempoDanca;
    }
    
    public int calcularGasto(Corpo corpo){
        double custo = this.tempoDanca * corpo.getMultiplicadorGasto();
        return (int) custo;
    }
}