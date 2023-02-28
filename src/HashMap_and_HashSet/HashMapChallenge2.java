package HashMap_and_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapChallenge2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        for(String s : map.keySet()){
            set.add(s);
        }
        for(String s : map.values()){
            if(set.contains(s)){
                set.remove(s);
            }
        }
        String s = null;
        for(String s1 : set){
            s = s1;
        }
        
        while(true){
            if(map.get(s)==null) {
                System.out.print(s);
                break;
            }
            System.out.print(s + " -> ");
            s = map.get(s);
        }

    }
}
