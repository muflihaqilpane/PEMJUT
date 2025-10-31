import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//aqil
        ArrayList<DeadlineReminder> tasks = new ArrayList<>();

        System.out.print("Masukkan jumlah tugas: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Tugas ke-" + (i + 1));
            System.out.print("Nama tugas: ");
            String taskName = scanner.nextLine();
            System.out.print("Mata kuliah: ");
            String courseName = scanner.nextLine();
            System.out.print("Deadline (yyyy-mm-dd): ");
            String dueDate = scanner.nextLine();

            tasks.add(new DeadlineReminder(taskName, courseName, dueDate));
        }

        System.out.println("\n📅 Daftar Tugas Kuliah:");
        for (DeadlineReminder task : tasks) {
            task.displayInfo();
        }
    }
}
