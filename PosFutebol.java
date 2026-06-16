
public enum PosFutebol
{
    GOLEIRO(0.6),
    ZAGUEIRO(1.0),
    ATACANTE(1.3),
    LATERAL(1.5),
    MEIOCAMPO(1.6);
    
    private double gastoPorMinuto;
    
    PosFutebol(double gasto){
        this.gastoPorMinuto = gasto;
    }
    
    public double getGastoPorMinuto(){
        return this.gastoPorMinuto;
    }
    
}