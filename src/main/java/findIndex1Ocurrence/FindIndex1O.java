package findIndex1Ocurrence;

public class FindIndex1O {

    public int findInd(String haystack, String needle) {

        for (int i = 0; i < haystack.length()-needle.length() ; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
