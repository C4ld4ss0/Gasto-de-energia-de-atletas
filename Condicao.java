
public enum Condicao{
    DESCANCADO(true, 0.25), 
    NORMAL(true, 0.0), 
    CANSADO(true, -0.2), 
    DOLORIDO(false, 0.0),
    QUEBRADO(false, 0.0);
    
    private boolean isAptoParaTreinar;
    private double descontoGasto;
    
    Condicao(boolean isAptoParaTreinar, double descontoGasto){
        this.isAptoParaTreinar = isAptoParaTreinar;
        this.descontoGasto = descontoGasto;
    }
    
    public boolean getIsAptoParaTreinar(){
        return this.isAptoParaTreinar;
    }
    
    public double getDescontoGasto(){
        return this.descontoGasto;
    }
}