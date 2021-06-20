import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Buscador {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        try {

            Scanner in = new Scanner(new FileReader("entrada.txt"));
            
            while(in.hasNextLine()) {
                lista.add(in.nextLine());
            }

            in.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException", "Exception Catched", JOptionPane.INFORMATION_MESSAGE);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o inicio da palavra: ");
        String inicio = scan.nextLine();
        System.out.printf("Digite o termino da palavra: ");
        String termino = scan.nextLine();
        scan.close();
        
        Dicionario dicionario = new Dicionario(lista);
        System.out.println();
        System.out.println(dicionario.buscaInicio(inicio));
        System.out.println();
        System.out.println(dicionario.buscaTerminacao(termino));
        System.out.println();
        System.out.println(dicionario.buscaInicioTermino(inicio, termino));
        System.out.println();
    }
}
