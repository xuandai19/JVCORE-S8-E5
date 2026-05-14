import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        do {
            System.out.println("\n===== MENU SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Tìm sinh viên GPA cao nhất");
            System.out.println("4. In tổng số sinh viên đã tạo");
            System.out.println("0. Thoát");

            System.out.print("lựa chọn của bạn: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhập sinh viên thứ " + (i + 1));

                        students[i] = new Student();
                        students[i].input();
                    }
                    break;

                case 2:
                    System.out.println("\nDanh sách sinh viên:");

                    for (Student student : students) {
                        if (student != null) {
                            student.print();
                        }
                    }
                    break;

                case 3:
                    Student maxStudent = students[0];

                    for (int i = 1; i < n; i++) {
                        if (students[i] != null &&
                                students[i].getGpa() > maxStudent.getGpa()) {

                            maxStudent = students[i];
                        }
                    }

                    System.out.println("\nSinh viên GPA cao nhất:");
                    maxStudent.print();
                    break;

                case 4:
                    System.out.println("Tổng số sinh viên đã tạo: "
                            + Student.getTotalStudent());
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);
    }
}
