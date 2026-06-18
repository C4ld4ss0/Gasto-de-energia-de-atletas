
public enum PosHandebol{

  GOLEIRO(0.8),
  ARMADOR(1.3),
  PONTA(1.4),
  CENTRAL(1.4),
  PIVO(1.6);
  
  private double gastoPorMinuto;

  PosHandebol(double gastoPorMinuto){
    this.gastoPorMinuto = gastoPorMinuto;
  }
  public double getGastoPorMinuto(){
    return this.gastoPorMinuto;
  }
}
