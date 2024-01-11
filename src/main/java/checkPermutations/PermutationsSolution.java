package checkPermutations;

import java.util.HashMap;
import java.util.Map;

public class PermutationsSolution {
    //Given two Strings write function if one is permuations of the other.
    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map1);

        for (char ch2 : s2.toCharArray()) {
            //if contains key: reduce value
            if (map1.containsKey(ch2) && (map1.get(ch2) > 0)) {
                map1.put(ch2, map1.getOrDefault(ch2, 0) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
