public class Main {
    public static void main(String[] args) {
        //Student student = new Student(1, "Nguyen Van A", 20);
        //student.printInfo();

//        Book book = new Book("Java", "Nguyen Van A", 36.50);
//        book.printInfo();

        CurrencyConverter.setRate(25000);

        int vnd = 500000;

        double usd = CurrencyConverter.toUSD(vnd);

        System.out.println("Tỉ giá: " + CurrencyConverter.getRate());
        System.out.println(vnd + " VND = " + CurrencyConverter.formatUSD(usd));
    }
}