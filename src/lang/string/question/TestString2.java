package lang.string.question;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jap"};

        int sum = 0;
        for (String string : arr) {
            int length = string.length();
            System.out.println(string + " : " + length);
            sum += length;
        }
        System.out.println("sum = " + sum);
    }
}
