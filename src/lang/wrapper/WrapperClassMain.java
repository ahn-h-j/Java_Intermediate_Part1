package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = Integer.valueOf(10);
        Long newLong = Long.valueOf(100);
        Double newDouble = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("newLong = " + newLong);
        System.out.println("newDouble = " + newDouble);

        int intValue = newInteger.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = newLong.longValue();
        System.out.println("longValue = " + longValue);
        double doubleValue = newDouble.doubleValue();
        System.out.println("doubleValue = " + doubleValue);
    }
}
