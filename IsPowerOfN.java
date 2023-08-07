public class IsPowerOfN {
    // Checks is num is a power of n.
    public boolean isPowerOf(int N, int num) {

        for (int i = 0; i < 100; i++) {
            if (Math.pow(N, i) == num) {
                return true;
            }
        }
        return false;
    }
}
