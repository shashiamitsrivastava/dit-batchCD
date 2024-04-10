public class Subsequence {
    static void genSubsequences(String str, String result) {
        if (str == "") {
            System.out.print(result + " , ");
            return;
        }
        genSubsequences(str.substring(1), result);
        genSubsequences(str.substring(1), result + str.charAt(0));
    }

    public static void main(String[] args) {
        genSubsequences("abc", "");
    }

}
