package longestSubstringWithoutRepChars;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstr {

    public int lengthLongestSubarray(String s) {
        int res = 0;
        //BRUTE FORCE: TAKE EACH char and look how TC= O(N2)

        //SLIDING WINDOW
        //two pointers, left and right
        int left=0;
        int right=1;

        while(right<s.length()){
            Set<Character> chars= new HashSet<>();
            chars.add(s.charAt(left));
            while(chars.add(s.charAt(right))){
                right++;
                res=Integer.max(res,right-left);
            }
            right++;
            left=right-1;
        }
        return res;
    }
}
