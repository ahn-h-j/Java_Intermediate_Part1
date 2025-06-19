package lang.string.question;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String string : split) {
            System.out.println(string);
        }
        System.out.println(String.join("->",split));
    }
}
