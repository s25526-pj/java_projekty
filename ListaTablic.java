package listatablic;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaTablic {

   
    public static void main(String[] args) {
        
        ListaTablic a = new ListaTablic();
        
        String[] jedzenie = {"pizza", "stek", "pomidor", "chleb", "szynka","spaghetti"};
        String[] zwierzeta = {"kot", "pies", "koń", "ryba", "patyczak"};
        String[] rosliny = {"róża", "fiołek", "grusza", "trwa", "tulipan"};
       
        ArrayList<String[]> lista = new ArrayList<String[]>();
        lista.add(jedzenie);
        lista.add(zwierzeta);
        lista.add(rosliny);   
        
 
        a.dlugoscListy(lista);
      
    }
    
    /**
     *
     * @param lista
     * @return
     */
    public int dlugoscListy(ArrayList<String[]> lista)
{

    
    String dlugoscPierwsza = Arrays.toString(lista.get(0));
    String dlugoscDruga = Arrays.toString(lista.get(1));
    String dlugoscTrzecia = Arrays.toString(lista.get(2));
        
        int dlugoscListy = dlugoscPierwsza.length() + dlugoscDruga.length() + dlugoscTrzecia.length();
        
        System.out.println(dlugoscListy);
        
    return 0;

}
    
}
