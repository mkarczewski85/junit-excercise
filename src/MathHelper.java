public class MathHelper {

    public static int factotrial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factotrial(n - 1);
        }
    }

}
