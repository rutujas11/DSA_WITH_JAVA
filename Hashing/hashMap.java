
import java.util.HashMap;

public class hashMap {
    public static void main(String args[]){

    ///// 1)HASHMAP
        @SuppressWarnings("Convert2Diamond")
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        ///Insertion
        hmap.put("rutu",1);
        hmap.put("rush",2);
        hmap.put("sandesh",3);
        ///Accessing values
        System.out.println(hmap.get("sandesh"));
        ///deleting values
        hmap.remove("rutu");
        System.out.println(hmap);

    /////
    }
    
}
