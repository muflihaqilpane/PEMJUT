import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class StudentStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan nilai ujian akhir: ");
            int nilai = scanner.nextInt();

            if (nilai < 0 || nilai > 100) {
                throw new InvalidNumberException("Nilai harus antara 0 - 100!");
            }

            // Tentukan status kelulusan
            String status;
            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            System.out.println("Mahasiswa: " + nama);
            System.out.println("Nilai: " + nilai);
            System.out.println("Status: " + status);

        } catch (InvalidNumberException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Pastikan memasukkan nilai berupa angka.");
        } finally {
            scanner.close();
        }
    }
}