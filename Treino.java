    
public void treinar(Treinamento treinoEscolhido){
    int custoFinal = treinoEscolhido.calcularGasto(this.corpo);
    this.energia -= custoFinal;
}