public class Main {
    public static void main(String[] args) {
        //Student student = new Student(1, "Nguyen Van A", 20);
        //student.printInfo();

//        Book book = new Book("Java", "Nguyen Van A", 36.50);
//        book.printInfo();

//        CurrencyConverter.setRate(25000);
//
//        int vnd = 500000;
//
//        double usd = CurrencyConverter.toUSD(vnd);
//
//        System.out.println("Tỉ giá: " + CurrencyConverter.getRate());
//        System.out.println(vnd + " VND = " + CurrencyConverter.formatUSD(usd));

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);

        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);
        System.out.println("Rectangle 3: " + r3);

        double maxArea = r1.getArea();
        Rectangle maxRect = r1;
        int rectNumber = 1;

        if (r2.getArea() > maxArea) {
            maxArea = r2.getArea();
            maxRect = r2;
            rectNumber = 2;
        }

        if (r3.getArea() > maxArea) {
            maxArea = r3.getArea();
            maxRect = r3;
            rectNumber = 3;
        }

        System.out.println();
        System.out.println("Largest area = " + maxArea
                + " (Rectangle " + rectNumber
                + ": width=" + maxRect.getWidth()
                + ", height=" + maxRect.getHeight() + ")");
    }
}