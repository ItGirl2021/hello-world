import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dicionario {
    List<String> dicionario;

    public Dicionario(List<String> dicio) {
        
        dicionario = dicio;

    }

    public List<String> buscaTerminacao(String termino) {
        if(termino.isEmpty()) return dicionario;

        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            String palavra = it.next();
            String substrg = palavra.substring(palavra.length() - termino.length(), palavra.length());
            if(substrg.equals(termino)) palavras.add(palavra);
        }

        return palavras;
    }

    public List<String> buscaInicio(String inicio) {
        if(inicio.isEmpty()) return dicionario;
        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            String palavra = it.next();
            String substrg = palavra.substring(0, inicio.length());
            if(substrg.equals(inicio)) palavras.add(palavra);
        }

        return palavras;
    }

    public List<String> buscaInicioTermino(String inicio, String termino) {
        if(inicio.isEmpty() && termino.isEmpty()) return dicionario;
        if(inicio.isEmpty() && !(termino.isEmpty())) return buscaTerminacao(termino);
        if(!(inicio.isEmpty()) && termino.isEmpty()) return buscaInicio(inicio);

        List<String> palavras = new ArrayList<>();
        Iterator<String> it = dicionario.iterator();

        while(it.hasNext()) {
            String palavra = it.next();
            String tpalavra = palavra.substring(palavra.length() - termino.length(), palavra.length());
            String ipalavra = palavra.substring(0, inicio.length());
            if((tpalavra.equals(termino)) && (ipalavra.equals(inicio))) palavras.add(palavra);
        }

        return palavras;
    }
}
