
public enum NivelFuncional{
  INICIANTE(1.0),
  INTERMEDIARIO(1.3),
  AVANCADO(1.6);

  private double gastoBase;

  NivelFuncional(double gastoBase){this.gastoBase = gastoBase;}

  public double getGastoBase(){return this.gastoBase;}
