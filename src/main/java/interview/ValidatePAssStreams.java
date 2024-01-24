package interview;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ValidatePAssStreams {
    public static void main(String[] args) {

        String pass = "Jun1@carlm";
        System.out.println(validate(pass));
    }

    public static boolean validate(String password) {
        if (!containMinimumCharacters(password.length(), 6)) {
            return false;
        }
        if (hasUpperLetter(password) && passContainDigit(password) && containArroba(password) && hasDuplicatesChars(password)) {
            return true;
        }
        return false;
    }

    //Validate if has uppercase
    static boolean hasUpperLetter(String password) {
        return IntStream.range(0, password.length()).anyMatch(
                i -> Character.isUpperCase(password.charAt(i))
        );
    }

    //Validate if has Digits
    static boolean passContainDigit(String pass) {
        return IntStream.range(0, pass.length()).anyMatch(
                i -> Character.isDigit(pass.charAt(i))
        );
    }

    //contain arroba
    static boolean containArroba(String pass) {
        return IntStream.range(0, pass.length()).anyMatch(
                i -> '@' == pass.charAt(i)
        );
    }

    static boolean containMinimumCharacters(int tam, int required) {
        if (tam < required) return false;
        return true;
    }

    static boolean hasDuplicatesChars(String pass) {
        //put in a set and if it returns false, has duplicates.
        Set<Character> charsSet = new HashSet<>();
        return IntStream.range(0, pass.length()).
                allMatch(i -> charsSet.add(pass.charAt(i)));
    }
}