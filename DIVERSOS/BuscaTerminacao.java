import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BuscaTerminacao {
    public static void main(String[] args) {

        List<String> dicionario = new ArrayList<>();

        try {
            
            Scanner in = new Scanner(new FileReader("entrada.txt"));
            
            while(in.hasNextLine()) {
                dicionario.add(in.nextLine());
            }

            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException", "Exception Catched", JOptionPane.INFORMATION_MESSAGE);
        }

        Scanner scn = new Scanner(System.in);
        System.out.printf("Digite a terminação buscada: ");
        String terminacao = scn.nextLine();

        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            String palavra = it.next();
            if(terminacao.length() >= palavra.length()) continue;
            String tpalavra = (palavra.substring(palavra.length() - terminacao.length(), palavra.length()));
            if(tpalavra.equals(terminacao)) palavras.add(palavra);
        }

        System.out.println(palavras);
        scn.close();
    }
}