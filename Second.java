public class Second {
    public static void main(String[] args) {
        // int a = 55;
        // int b = a;
        // String name = "Shubham";
        // String name2 = name;
        // String name3 = "Shubham";
        // String name4 = new String("Shubham").intern();

        // System.out.println(name == name2);
        // System.out.println(name == name3);
        // System.out.println(name == name4);
        String name = "Shubham";
        String name4 = new String("SHUBHAM");
        String name5 = new String("SHUBHAM");
        String name2 = name;
        name2 = name2.toUpperCase();
        System.out.println(name == name2);
        System.out.println(name2 == name4);
    };
}
