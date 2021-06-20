import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dicionario {
    List<String> dicionario;

    public Dicionario(List<String> dicio) {
        
        dicionario = dicio;

    }

    public List<String> buscaTerminacao(String termino) {
        if(termino.isBlank()) return null;

        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            
            try {

                String palavra = it.next();
                String substrg = palavra.substring(palavra.length() - termino.length(), palavra.length());
                if(substrg.equals(termino)) palavras.add(palavra);
            } catch(StringIndexOutOfBoundsException e) {
                System.out.println("Exception Catched!");
                continue;
            }
        }

        return palavras;
    }

    public List<String> buscaInicio(String inicio) {
        if(inicio.isBlank()) return null;
        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            
            try {

                String palavra = it.next();
                String substrg = palavra.substring(0, inicio.length());
                if(substrg.equals(inicio)) palavras.add(palavra);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Exception Catched!");
                continue;
            }
        }

        return palavras;
    }

    public List<String> buscaInicioTermino(String inicio, String termino) {
        if(inicio.isBlank() && termino.isBlank()) return dicionario;
        if(inicio.isBlank() && !(termino.isBlank())) return buscaTerminacao(termino);
        if(!(inicio.isBlank()) && termino.isBlank()) return buscaInicio(inicio);

        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            String palavra = it.next();

            try {
                String tpalavra = palavra.substring(palavra.length() - termino.length(), palavra.length());
                String ipalavra = palavra.substring(0, inicio.length());
                if((tpalavra.equals(termino)) && (ipalavra.equals(inicio))) palavras.add(palavra);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Exception Catched!");
                continue;
            }

        }

        return palavras;
    }
}
