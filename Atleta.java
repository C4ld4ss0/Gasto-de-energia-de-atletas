
public class Atleta{
    private String nome;
    private int energia;
    private Corpo corpo;
    private Condicao cond;
    
    
    public Atleta(String nome, Condicao cond, Corpo corp){
        this.nome = nome;
        this.energia = corp.getEnergiaMaxima();
        this.corpo = corp;
        this.cond = cond;
    }
    
    public void treinar (Treinamento treinamento){
        if(!this.cond.getIsAptoParaTreinar()){
            System.out.println(this.nome + " Incapaz de treinar hoje!");
            return;
        }
        int custoBruto = treinamento.calcularGasto(this.corpo);
        int desconto = (int) (custoBruto * this.cond.getDescontoGasto());
        int custo = custoBruto - desconto;
        if(this.energia >= custo){
            this.energia -= custo;
            System.out.println("Treino concluído com exito! " + this.nome + ", você gastou " + custo + " de energia.");
            System.out.println("Energia restante é: " + this.energia + "/" + this.corpo.getEnergiaMaxima());
        }else{
            System.out.println("Não foi possível treinar " + this.nome + " tentou treinar, mas faltou energia! (Necessário: " + custo + ", Atual: " + this.energia + ")");
        }
    }
    
    public void descansar (int horas){
        int energiaRecuperada = horas * 15;
        this.energia += energiaRecuperada;
        int limiteEnergia = this.corpo.getEnergiaMaxima();
        if(this.energia > limiteEnergia){
            this.energia = limiteEnergia;
            System.out.println("Você já está com a energia cheia, o sono extra foi computado. ");
        }else{
            System.out.println(this.nome + " recuperou " + energiaRecuperada + " de energia. \n Energia atual: " + this.energia);
        }
    }
    
    public void exibirStatus(){
         System.out.println("----- STATUS DE " + this.nome.toUpperCase() + " -----" +
                            "Seu físico é: " + this.corpo + "| Condição: " + this.cond +
                            "Sua Energia é: " + this.energia + "/" + this.corpo.getEnergiaMaxima() + 
                             "------------------------------------");
    }
}
