package serviços;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarListaGenerica {

    public static <T> void ordernacao(List<T> lista){
        Collections.sort(lista, new Comparator<T>(){
            @Override
            public int compare(T o1, T o2) {
                return String.valueOf(o1).compareTo(String.valueOf(o2));
            }
        });
    }
}