package lang.string;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] array = str.split(",");

        String join = String.join("-", array);
        System.out.println("join = " + join);

        int num = 100;
        boolean bool = true;

        String numString = String.valueOf(num);
        String boolString = String.valueOf(bool);

        System.out.println("numString = " + numString);
        System.out.println("boolString = " + boolString);

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c+" ");
        }

        String format = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println("format = " + format);
    }
}
