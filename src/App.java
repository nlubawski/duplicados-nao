import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1  = new String[] {"a","b","c","d","e"};
        String[] array2  = new String[] {"x","y","c","d","z"};

        Set<String> setArray2 = new HashSet<>();  

        for(int i = 0; i< array2.length; i++){
            setArray2.add(array2[i]);
        }

        for(int i = 0; i< array1.length; i++){
            if(setArray2.contains(array1[i])){
                System.out.println(array1[i]);
            }
        }



    }
}
