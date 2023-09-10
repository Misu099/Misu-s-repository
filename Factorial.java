 public class Factorial {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int factorialV1 (int n){
        int res = 1;
        for ( int i = 1; i <=n; i++){
            res *= i;
        }
        return res;
    }




}
