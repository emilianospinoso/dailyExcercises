package plusOne;

public class PlusOneSolution {

    public int[] plusOne(int[] digits) {
        //1-Convert to int, plus one and return it.
        //2- look for nines and convert to zero.

        //iterate looking ig digit is less than zero.
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }


        return digits;
    }
}
