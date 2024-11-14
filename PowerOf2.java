

public class PowerOf2 {
    public static void main(String[] args) {
        PowerOf2 p = new PowerOf2();
        int num = 16;
        if (p.isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
