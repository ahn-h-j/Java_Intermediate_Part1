package lang.string.question;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String hello = str.substring(0,5);
        String txt = str.substring(5);
        System.out.println("fileName = " + hello);
        System.out.println("expName = " + txt);
    }
}
