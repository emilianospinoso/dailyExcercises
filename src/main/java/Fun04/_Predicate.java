package Fun04;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isValifPhonePredicate.test("07000000000"));

        //Concatenate Predicates.
        System.out.println("Is phone valid AND contains 3? ->" +
        isValifPhonePredicate.and(containsNumber3).test(("07000000000")));

        //the same with OR:
        System.out.println("Is phone valid OR  contains 3? ->" +
                isValifPhonePredicate.or(containsNumber3).test(("07000000000")));

        //Also there are BiPredicates (Compare two numbers.)
        System.out.println("Are the numbers equals=>"+ areEquals.test(2,3));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //the same is like this behind.
    static Predicate<String> isValifPhonePredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;


    //you can combine predicates with and.then
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<Integer,Integer> areEquals = (x,y)->
            x.equals(y);
}

