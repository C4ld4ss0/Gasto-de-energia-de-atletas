import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Principal{

   public static void main(String[] args){
       System.out.println("=== Iniciando sistema da academia ===");
            processarCatracaCSV("Treinos.csv");
            System.out.println("=== FIM DO EXPEDIENTE ===");
   }
    public static void processarCatracaCSV(String caminhoArquivo){
        try{
            Scanner leitor = new Scanner(new File(caminhoArquivo));
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                
                String nome = dados[0];
                Condicao cond = Condicao.valueOf(dados[1]);
                Corpo corpo = Corpo.valueOf(dados[2]);

                Atleta atletaDaLinha = new Atleta(nome, cond, corpo);

                String tipoEsporte = dados[3];
                Treinamento treinoDaLinha = null;

                if (tipoEsporte.equals("FUTEBOL")){
                    double tempo = Double.parseDouble(dados[4]);
                    PosFutebol pos = PosFutebol.valueOf(dados [5]);
                    int gols = Integer.parseInt(dados [6]);
                    boolean clima = converterParaBoolean(dados[7]);

                    treinoDaLinha = new TreinoFutebol(tempo, pos, gols, clima);
                   
                } else if(tipoEsporte.equals("BASQUETE")){
                   double tempo = Double.parseDouble(dados[4]);
                   PosBasquete pos = PosBasquete.valueOf(dados[5]);
                   int rebotes = Integer.parseInt(dados[6]);
                   boolean meiaQuadra = converterParaBoolean(dados[7]);

                   treinoDaLinha = new TreinoBasquete(tempo, pos, rebotes, meiaQuadra);
                   
                }else if(tipoEsporte.equals("CORRIDA")){
                   double distanciaKm = Double.parseDouble(dados[4]);
                   double pace = Double.parseDouble(dados[5]);
                   
                   treinoDaLinha = new TreinoCorrida(distanciaKm, pace);
                   
                }else if(tipoEsporte.equals("VÔLEI")){
                   int sets = Integer.parseInt(dados[4]);
                   PosVolei pos = PosVolei.valueOf(dados[5]);
                   
                   treinoDaLinha = new TreinoVolei(sets, pos);
                   
                }else if(tipoEsporte.equals("HANDEBOL")){
                   double tempoJogo = Double.parseDouble(dados[4]);
                   PosHandebol pos = PosHandebol.valueOf(dados[5]);
                   int gols = Integer.parseInt(dados[6]);
                   boolean partida = converterParaBoolean(dados[7]);
                   
                   treinoDaLinha = new TreinoHandebol(tempoJogo, pos, gols, partida);
                   
                }else if(tipoEsporte.equals("ZUMBA")){
                   double tempo = Double.parseDouble(dados[4]);

                   treinoDaLinha = new TreinoZumba(tempo);
                   
                }else if(tipoEsporte.equals("MUSCULAÇÃO")){
                   int pesoTotalLevantado = Integer.parseInt(dados[4]);

                   treinoDaLinha = new TreinoMusculacao(pesoTotalLevantado);
                   
                }else if(tipoEsporte.equals("ATLETISMO")){
                   double distancia = Double.parseDouble(dados[4]);
                   double tempoMin = Double.parseDouble(dados[5]);
                   TerrenoCorrida terreno = TerrenoCorrida.valueOf(dados[6]);
                   boolean clima = converterParaBoolean(dados[7]);
                   
                   treinoDaLinha = new TreinoAtletismo(distancia, tempoMin, terreno, clima);
                      
                }else if(tipoEsporte.equals("FUNCIONAL")){
                   double tempo = Double.parseDouble(dados[4]);
                   NivelFuncional nivel = NivelFuncional.valueOf(dados[5]);
                   boolean pesos = converterParaBoolean(dados[6]);

                treinoDaLinha = new TreinoFuncional(tempo, nivel, pesos);
                }
                   if(treinoDaLinha != null){
                      System.out.println("Catraca liberada: " + nome + " Vai treinar " + tipoEsporte);
                      atletaDaLinha.treinar(treinoDaLinha);
                   }else{
                      System.out.println("Catraca bloqueada: Esporte " + tipoEsporte + " Não reconhecido no sistema.");
                   }
            }
           leitor.close();
        }
             catch (FileNotFoundException e){
            System.out.println("Opa! Arquivo não encontrado: " + caminhoArquivo);
        }
    }

   public static boolean converterParaBoolean(String texto){
      if (texto == null){return false;}
   
      String textoLimpo = texto.trim().toUpperCase();

      if(textoLimpo.equals("SIM")|| textoLimpo.equals("S") || textoLimpo.equals("TRUE") || textoLimpo.equals("SI")||textoLimpo.equals("SS")){return true;}

      return false;
   }
}
