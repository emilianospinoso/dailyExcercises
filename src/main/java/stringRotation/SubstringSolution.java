package stringRotation;

public class SubstringSolution {
    //CHek if one word is substring of another

    public boolean isSubstring(String s1, String s2) {
        if (s2.length() > s1.length()) return false;

        s1=s1.concat(s1);
        System.out.println(s1);
        if (s1.contains(s2)) {
            return true;
        }

        return false;
    }
}
