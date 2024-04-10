public class Factorial {
    static int fact(int number) {
        if (number == 1) {
            return 1;
        }
        return number * fact(number - 1);

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
