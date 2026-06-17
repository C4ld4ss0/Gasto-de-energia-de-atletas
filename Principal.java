import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Principal{

   public static void main(String[] args){
       System.out.println("=== Iniciando sistema da academia ===");
            processarCatrcaCSV("Treinos.csv");
            System.out.println("=== FIM DO EXPEDIENTE ===")
   }
    public static void processarCatracaCsv(String caminhoArquivo){
        try{
            Scanner leitor = new Scanner(new File(caminhoArquivo));
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] dados = linha.spli(";");
                
                String nome = dados[0];
                Condicao cond = Condicao.valueOf(dados[1]);
                Corpo corp = Corpo.valueOf(dados[2]);

                Atleta atletaDaLinha = new Atleta(nome, cond, corpo);

                String tipoEsporte = dados[3];
                Treinamento treinoDaLinha = null;

                if (tipoEsporte.equals("FUTEBOL")){
                    double tempo = double.parseDouble(dados[4]);
                    PosFutebol pos = posFutebol.valueOf(dados [5]);
                    int gols = Integer.parseInt(dados [6]);
                    boolean clima = boolean.parseBoolean(dados[7]);

                    treinoDaLinha = new TreinoFutebol(tempo, pos, gols, clima);
                }
                else if(tipoEsporte.equals("Basquete")){
                    
                    
                }
                    
            }
        }catch (FileNotFoundException e){
            System.out.println("Opa! Arquivo não encontrado: " + caminhoArquivo);
        }
        return listaDeTreinos;
    }
}
