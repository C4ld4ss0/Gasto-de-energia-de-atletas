import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal{
    
    public static void main (String Args[]){
        String nomeArquivo = "Treinos.csv";
        List<Treinamento> Treinos = lerTreinoCSV(nomeArquivo);
    }
    
    public static List<Treinamento> lerTreinoCSV(String caminhoArquivo){
        List <Treinamento> listaDeTreinos = new ArrayList<>();
        try{
            Scanner leitor = new Scanner(new File(caminhoArquivo));
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("Opa! Arquivo não encontrado: " + caminhoArquivo);
        }
        return listaDeTreinos;
    }
}