// to convert soucre code into byte code we have a command javac <JavaSouceFileName.java>
// java <ByteCodeFileName>

import java.io.FileNotFoundException;
import java.io.PrintStream;

class ABCD {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("C:\\Users\\ACER\\Documents\\DIT(CD)\\res.txt"));
        System.out.println("Hello");
    }
}