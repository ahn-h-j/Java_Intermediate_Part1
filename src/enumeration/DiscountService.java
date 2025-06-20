package enumeration;

public class DiscountService {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println(Grade.BASIC.discount(price));
        System.out.println(Grade.GOLD.discount(price));
        System.out.println(Grade.DIAMOND.discount(price));
    }
}
