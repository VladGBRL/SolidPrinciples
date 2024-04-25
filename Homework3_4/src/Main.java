public class Main {
    public static void main(String[] args) {
        MultifunctionalPrinter mfp = new MultifunctionalPrinterHelper();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}