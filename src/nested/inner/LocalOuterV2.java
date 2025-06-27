package nested.inner;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        Printer process = localOuterV1.process(2);
        process.print();
    }
}
