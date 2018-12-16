package mathProblemsPackage;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "BOSTON");
        map.put(4, "SEATLE");
        map.put(5, "WASHINGTON");
        map.put(6, "JERSEY CITY");
        map.put(7, "DALLAS");
        for (Map.Entry<Integer, String> USA:map.entrySet()){
            System.out.println("Collection View Is : "+USA.getKey()+" : "+USA.getValue());
        }
    }
}
