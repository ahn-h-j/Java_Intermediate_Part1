package lang.wrapper.question;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String string : array) {
            sum += Double.parseDouble(string);
        }
        System.out.println("sum = " + sum);
    }
}
