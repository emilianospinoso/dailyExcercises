package isUnique;

public class UniqueSolution {

    public boolean isUnique(String word) {
        //create array booleans
        boolean[] charSet = new boolean[128];

        //iterate and if array has the data previous return false.
        for (int i = 0; i < word.length(); i++) {
            if (!charSet[word.charAt(i)]) {
                charSet[word.charAt(i)] = true;
            } else {
                return false;
            }
        }
        return true;
    }
    //Time compl: oN/SPACE=o1
}
