import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new InvalidNumberException("Jumlah angka harus lebih dari 0!");
            }

            int[] angka = new int[n];
            System.out.println("Masukkan angka-angka (harus positif):");
            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                if (input <= 0) {
                    throw new InvalidNumberException("Angka harus positif! Ditemukan: " + input);
                }
                angka[i] = input;
            }

            int total = 0;
            for (int i = 0; i < n; i++) {
                total += angka[i];
            }

            double rataRata = (double) total / n;
            System.out.println("Rata-rata adalah: " + rataRata);

        } catch (InvalidNumberException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
}
