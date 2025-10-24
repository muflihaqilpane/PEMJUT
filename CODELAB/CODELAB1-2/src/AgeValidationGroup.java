import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidationGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        for (String orang : nama) {
            System.out.print("Masukkan usia " + orang + ": ");
            try {
                int usia = scanner.nextInt();
                if (usia <= 0 || usia >= 120) {
                    throw new InvalidAgeException(
                            "Usia " + orang + " tidak valid! Harus > 0 dan < 120."
                    );
                }
                System.out.println(orang + " berusia " + usia + " tahun.\n");
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!\n");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
