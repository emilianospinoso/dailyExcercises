package interview;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class Exercise01 {
    //Validar contraseña/
    //debe contener una mayuscula
    public boolean validatePassword(String password) {
        char[] pass = password.toCharArray();
        boolean containsUpper= false;
        boolean containesNumber=false;
        String numbers= "0123456789";
        if(password.length()<6){
            return false;
        }
        id

        for (int i = 0; i < password.length(); i++) {
            Character letter = password.charAt(i);
            if (isUpperCase(letter)) {
                containsUpper=true;
            }
            if(isDigit(letter)){
                containesNumber=true;
            }
            if(containesNumber&&containsUpper){
                return true;
            }
        }
        return false;
    }
}
