package HashMap_and_HashSet;

import java.util.HashSet;

public class HashSetChallenge {
    public static void main(String[] args) {

        int num1[] = {5, 6, 9};
        int num2[] = {1, 2, 3, 4, 5, 7, 8};

        HashSet<Integer> set = new HashSet<>();

        for(int i : num1){
            set.add(i);
        }
        for(int i : num2){
            set.add(i);
        }

        System.out.println(set.size());
    }
}
