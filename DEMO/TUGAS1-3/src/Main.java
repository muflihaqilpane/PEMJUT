import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("=== SELAMAT DATANG DI RESTORAN CHATGPT ===");
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mie Goreng - Rp12000");
        System.out.println("3. Es Teh - Rp5000");
        System.out.println("4. Keluar & Cetak Nota");

        while (true) {
            System.out.print("Pilih menu (1-4): ");
            int choice = sc.nextInt();
            if (choice == 4) break;

            switch (choice) {
                case 1 -> order.addItem(new MenuItem("Nasi Goreng", 15000));
                case 2 -> order.addItem(new MenuItem("Mie Goreng", 12000));
                case 3 -> order.addItem(new MenuItem("Es Teh", 5000));
                default -> System.out.println("Pilihan tidak valid.");
            }
        }

        Receipt.printReceipt(order);
    }
}