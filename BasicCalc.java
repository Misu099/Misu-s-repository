public class BasicCalc {


    public int division(long n, long d) {
        int count = 0;
        while (n >= d) {
            n = substraction(n, d);
            count++;
        }
        return count;
    }
    public long substraction(long n, long q) {
        n -= q;
        return n;
    }
}
