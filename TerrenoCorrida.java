
public enum TerrenoCorrida{
  PistaLisa(1.0),
  Rua(1.2),
  Trilha(1.4);

  private double dificuldade;

  TerrenoCorrida(double dificuldade){this.dificuldade = dificuldade;}

  public double getDificuldade(){return this.dificuldade;}
