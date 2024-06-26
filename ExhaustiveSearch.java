public class ExhaustiveSearch {

    static void allPosAtoZ(int len, String result) {
        if (len == result.length()) {
            System.out.print(result + " ");
            return;
        }
        for (char alpha = 'A'; alpha <= 'Z'; alpha++) {
            if (alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
                allPosAtoZ(len, result + alpha);
            }
        }
    }

    public static void main(String[] args) {
        allPosAtoZ(2, "");
    }

}
