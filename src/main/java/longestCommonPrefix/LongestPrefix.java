package longestCommonPrefix;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0){
            return "";
        }
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                //short the prefix by one
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
