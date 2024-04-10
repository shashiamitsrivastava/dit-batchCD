public class PrintTable {
    static void printTable(int num, int mul) {
        if (mul < 1) {
            return;
        }
        printTable(num, mul - 1);
        System.out.println(num + "x" + mul + "=" + mul * num);
    }

    static String table(int num, int mul) {
        if (mul < 1) {
            return "";
        }
        String ans = table(num, mul - 1);
        ans += num + "x" + mul + "=" + mul * num + "\n";
        return ans;

    }

    public static void main(String[] args) {
        // printTable(2, 10);
        System.out.println(table(5, 10));
    }

}
