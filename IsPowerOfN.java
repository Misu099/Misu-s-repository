public class IsPowerOfN {
    // Checks is num is a power of n.
    public boolean isPowerOf(int num, int n) {

        for (int i = 0; i < 100; i++) {
            if (Math.pow(n, i) == num) {
                return true;
            }
        }
        return false;
    }
}
