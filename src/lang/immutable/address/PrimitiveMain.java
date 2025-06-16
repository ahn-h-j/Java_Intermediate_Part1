package lang.immutable.address;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
