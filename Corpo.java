
public enum Corpo{
    OBESO(2.5, 40), 
    GORDALHASSO(2.0, 60), 
    GORDO(1.5, 80), 
    FOFINHO(1.2, 90), 
    MEDIA(1.0, 100), 
    ATLETA(0.8, 130), 
    BODYBUILDER(0.9, 150), 
    MAGRO(1.2, 90),
    SUBNUTRIDO(1.5, 70),
    VARAPAU(1.8, 60);
    
    private double multiplicadorGasto;
    private int energiaMaxima;
    
    Corpo(double multiplicadorGasto, int energiaMaxima){
        this.multiplicadorGasto = multiplicadorGasto;
        this.energiaMaxima = energiaMaxima;
    }
    
    public double getMultiplicadorGasto(){
        return this.multiplicadorGasto;
    }
    
    public int getEnergiaMaxima(){
        return this.energiaMaxima;
    }
}