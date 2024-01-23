package interview;

import java.util.stream.IntStream;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class Exercise01 {

    public boolean validatePassword(String password) {
        return containsDigit(password) && containsUppercase(password)&&has1Arroba(password);
    }

    public boolean containsDigit(String pass) {
        return IntStream.range(0, pass.length())
                .anyMatch(i -> isDigit(pass.charAt(i)));
    }

    public boolean containsUppercase(String pass) {
        return IntStream.range(0, pass.length())
                .anyMatch(i -> isUpperCase(pass.charAt(i)));
    }

    //Calculate if has arroba
    public boolean hasArroba(String pass) {
        return IntStream.range(0, pass.length())
                .anyMatch(i -> pass.charAt(i) == '@');
    }

    //calculate if has ONLY 1 arroba
    public boolean has1Arroba(String pass) {
        int qArroba = (int) IntStream.range(0, pass.length()).filter(
                i->pass.charAt(i)=='@'
        ).count();
        return qArroba==1;
    }
}
