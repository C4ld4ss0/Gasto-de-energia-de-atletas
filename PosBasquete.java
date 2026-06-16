
public enum PosBasquete{
    ARMADOR(1.5),
    ALA(1.2),
    PIVO(1.8);
    
    private double gastoPorMinuto;
    
    PosBasquete(double gasto){
        this.gastoPorMinuto = gasto;
    }
    
    public double getGastoPorMinuto(){
        return this.gastoPorMinuto;
    }
}