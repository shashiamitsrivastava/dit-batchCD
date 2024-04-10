public class Fib {
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int firstTerm = fib(n - 1);
        int secTerm = fib(n - 2);
        return firstTerm + secTerm;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));

    }

}
