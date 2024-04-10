public class SumOfDigit {
    static void sumOfDigit(int number, int sum) {
        if (number == 0) {
            System.out.println("The sum is " + sum);
            return;
        }
        sum += number % 10;
        sumOfDigit(number / 10, sum);

    }

    static int sumOfDigit(int number) {
        if (number == 0) {
            return 0;
        }
        int sum = sumOfDigit(number / 10);
        sum += number % 10;
        return sum;
    }

    public static void main(String[] args) {
        // sumOfDigit(12345, 0);
        System.out.println(sumOfDigit(12345));
    }

}
