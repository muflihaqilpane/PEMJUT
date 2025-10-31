import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void printReceipt(Order order) {
        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Tanggal : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        System.out.println("---------------------------");

        for (MenuItem item : order.getItems()) {
            System.out.println(item);
        }

        System.out.println("---------------------------");
        System.out.println("TOTAL : Rp" + order.getTotal());
        System.out.println("===========================");
        System.out.println("Terima kasih sudah memesan!");
    }
}