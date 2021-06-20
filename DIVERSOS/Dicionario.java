import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dicionario {
    List<String> dicionario;

    public Dicionario(List<String> dicio) {
        
        dicionario = dicio;

    }

    public List<String> buscaTerminacao(String termino) {
        
        List<String> palavras = new ArrayList<>();
        if(termino.isBlank()) return palavras;

        Iterator<String> it = dicionario.iterator();
        while(it.hasNext()) {
            
            try {

                String palavra = it.next();
                if(palavra.endsWith(termino)) palavras.add(palavra);

            } catch(StringIndexOutOfBoundsException e) {

                System.out.println("Exception Catched!");
                continue;
            }
        }

        return palavras;
    }

    public List<String> buscaInicio(String inicio) {
        
        List<String> palavras = new ArrayList<>();
        if(inicio.isBlank()) return palavras;

        Iterator<String> it = dicionario.iterator();
        while(it.hasNext()) {
            
            try {

                String palavra = it.next();
                if(palavra.startsWith(inicio)) palavras.add(palavra);

            } catch (StringIndexOutOfBoundsException e) {
                
                System.out.println("Exception Catched!");
                continue;
            }
        }

        return palavras;
    }

    public List<String> buscaInicioTermino(String inicio, String termino) {
       
        List<String> palavras = new ArrayList<>();

        if(inicio.isBlank() || termino.isBlank()) return palavras;

        Iterator<String> it = dicionario.iterator();
        while(it.hasNext()) {

            try {
                
                String palavra = it.next();
                if(palavra.endsWith(termino) && palavra.startsWith(inicio)) palavras.add(palavra);

            } catch (StringIndexOutOfBoundsException e) {

                System.out.println("Exception Catched!");
                continue;
            }

        }

        return palavras;
    }
}
