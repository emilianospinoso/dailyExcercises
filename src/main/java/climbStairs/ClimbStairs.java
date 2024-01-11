package climbStairs;

public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    static int climbStairs(int n){
        if(n<=1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

}
