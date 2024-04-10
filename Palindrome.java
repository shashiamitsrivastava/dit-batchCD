public class Palindrome {
    static void checkPalindrome(int number, int reverse, int cpy) {
        if (number == 0) {
            if (reverse == cpy) {
                System.out.println("The Number is Palindrome");
            } else {
                System.out.println("The Number is Not Palindrome");
            }
            return;
        }
        reverse = reverse * 10 + number % 10;
        checkPalindrome(number / 10, reverse, cpy);
    }

    static boolean isPlaindrome(int number, int reverse, int cpy){
        
    }

    public static void main(String[] args) {
        int number = 12345;
        checkPalindrome(number, 0, number);
    }

}
