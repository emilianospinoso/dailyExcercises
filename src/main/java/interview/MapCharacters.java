package interview;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MapCharacters {
    //validate if phrase has repeated chars.
    public static void main(String[] args) {
        System.out.println(nonRepeatedCharactersStream("Phrase z k l"));
    }

    public static boolean nonRepeatedChars(String phrase) {
        Set<Character> characterSet= new HashSet<>();
        String phraseToLower=phrase.toLowerCase();
        for (int i = 0; i < phraseToLower.length(); i++) {
            if(phrase.charAt(i)!=' '){
                boolean nonRepeated= characterSet.add(phraseToLower.charAt(i));
                if(!nonRepeated) return false;
            }
        }
        System.out.println("All characters are diferent");
        return true;
    }

    public static boolean nonRepeatedCharactersStream(String phrase){
        Set<Character> characterSet= new HashSet<>();
        String phraseToLower=phrase.toLowerCase();
        //allMatch returns true if ALLLLLL elements match the provided predicate
        return IntStream.range(0, phraseToLower.length())
                .filter(i->phraseToLower.charAt(i)!=' ')
                .allMatch(i -> characterSet.add(phraseToLower.charAt(i)));
    }
}
