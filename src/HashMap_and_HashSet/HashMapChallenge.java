package HashMap_and_HashSet;

import java.util.HashMap;

public class HashMapChallenge {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int num[] = {1, 2, 1, 3, 2, 5, 1, 1, 8};

        for (int n : num) {
            if(map.containsKey(n)){
                int freq = map.get(n);
                map.put(n, freq+1);
            }
            else{
                map.put(n, 1);
            }
        }



        for(int n : map.keySet()) {
            if (map.get(n) > num.length / 3) {
                System.out.println(n);
            }
        }



    }
}
