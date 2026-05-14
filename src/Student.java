import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private static int countStudent;

    public Student() {
        countStudent++;
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    final double SCORE_FACTOR = 0.25;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập gpa sinh viên: ");
        gpa = Double.parseDouble(sc.nextLine());
    }

    public void print() {
        System.out.printf("Id: %d, Name: %s, GPA: %.2f", id, name, gpa);
    }

    public double getGpa(){
        return gpa;
    }

    public static int getTotalStudent(){
        return countStudent;
    }
}
