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
                    boolean clima = converterParaBoolean(dados[7]);

                    treinoDaLinha = new TreinoFutebol(tempo, pos, gols, clima);
                   
                } else if(tipoEsporte.equals("BASQUETE")){
                   double tempo = double.parseDouble(dados[4]);
                   PosBasquete pos = posBasquete.valueOf(dados[5]);
                   int rebotes = Integer.parseInt(dados[6]);
                   boolean meiaQuadra = converterParaBoolean(dados[7]);

                   treinoDaLinha = new TreinoBasquete(tempo, pos, rebotes, meiaQuadra);
                   
                }else if(tipoEsporte.equals("CORRIDA")){
                   double distanciaKm = double.parseDouble(dados[4]);
                   double pace = double.parseDouble(dados[5]);
                   
                   treinoDaLinha = new TreinoCorrida(distanciaKm, pace);
                   
                }else if(tipoEsporte.equals("VÔLEI")){
                   String placar = String.valueOf(dados[4]);
                   PosVolei pos = posVolei.valueOf(dados[5]);
                   
                   treinoDaLinha = new TreinoVolei(placar, pos);
                   
                }else if(tipoEsporte.equals("HANDEBOL")){
                   double tempoJogo = double.parseDouble(dados[4]);
                   PosHandebol pos = posHandebol.valueOf(dados[5]);
                   int gols = Integer.parseInt(dados[6]);
                   boolean partida = converterParaBoolean(dados[7]);
                   
                   treinoDaLinha = new TreinoHandebol(tempoJogo, pos, gols, partida);
                   
                }else if(tipoEsporte.equals("ZUMBA")){
                   double tempo = double.parseDouble(dados[4]);

                   treinoDaLinha = new TreinoZumba(tempo);
                   
                }else if(tipoEsporte.equals("MUSCULAÇÃO")){
                   int pesoTotalLevantado = int.parseInt(dados[4]);

                   treinoDaLinha = new TreinoMusculacao(pesoTotalLevantado);
                   
                }else if(tipoEsporte.equals("ATLETISMO")){
                   double distancia = double.parseDouble(dados[4]);
                   double tempoMin = double.parseDouble(dados[5]);
                   TerrenoCorrida terreno = TerrenoCorrida.valueOf(dados[6]);
                   boolean clima = converterParaBoolean(dados[7]);
                   
                   treinoDaLinha = new TreinoAtletismo(distancia, tempoMin, terreno, clima);
                      
                }else if(tipoEsporte.equals("FUNCIONAL")){
                   double tempo = double.parseDouble(dados[4]);
                   NivelFuncional nivel = NivelFuncional.valueOf(dados[5]);
                   boolean pesos = converterParaBoolean(dados[6]);

                treinoDaLinha = new TreinoFuncional(tempo, nivel, pesos);
                   
        }catch (FileNotFoundException e){
            System.out.println("Opa! Arquivo não encontrado: " + caminhoArquivo);
        }
        return listaDeTreinos;
    }

   public static boolean converterParaBoolean(String texto do CSV){
      if (texto == null){return false;}
   
      String textoLimpo = texto.trim().toUppercase();

      if(textoLimpo.equals("SIM")|| textoLimpo.equals("S") || textoLimpo.equals("TRUE")){return true;}

      return false;
   }
}
