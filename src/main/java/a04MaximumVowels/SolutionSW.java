package a04MaximumVowels;

public class SolutionSW {

    public int maxVowels(String s, int k) {
        int tam = 0;
        int left = 0;
        int right = 1;
        String vowels = "AEIOUaeiou";

        while (right < s.length()) {
            while (vowels.contains(String.valueOf(s.charAt(left))) && vowels.contains(String.valueOf(s.charAt(right)))) {
                int auxTam = right - left + 1;
                tam = Integer.max(auxTam, tam);
                right++;
                if (tam == k) {
                    return k;
                }
            }
            if (!vowels.contains(String.valueOf(s.charAt(right)))||!vowels.contains(String.valueOf(s.charAt(left)))) {
                right++;
                left = right - 1;
            }
        }

        return tam;
    }

}
