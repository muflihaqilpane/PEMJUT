import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DeadlineReminder {
    public String tugas;
    public String matkul;
    public String deadline;

    public DeadlineReminder(String tugas, String matkul, String deadline) {
        this.tugas = tugas;
        this.matkul = matkul;
        this.deadline = deadline;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DeadlineReminder> list = new ArrayList<>();

        System.out.print("Masukkan jumlah tugas: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Tugas ke-" + (i + 1));
            System.out.print("Nama tugas: ");
            String tugas = sc.nextLine();
            System.out.print("Mata kuliah: ");
            String matkul = sc.nextLine();
            System.out.print("Deadline (yyyy-mm-dd): ");
            String deadline = sc.nextLine();

            list.add(new DeadlineReminder(tugas, matkul, deadline));
        }

        System.out.println("\nDaftar Tugas Kuliah:");
        for (DeadlineReminder d : list) {
            LocalDate today = LocalDate.now();
            LocalDate due = LocalDate.parse(d.deadline);
            long sisaHari = ChronoUnit.DAYS.between(today, due);
            System.out.println("- " + d.tugas + " (" + d.matkul + "), Deadline: " + d.deadline + " (" + sisaHari + " hari lagi)");
        }
    }
}
