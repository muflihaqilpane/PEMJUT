public class CodeLab1 {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};

        int maxLength = 0;
        for (String n : nama) {
            if (n.length() > maxLength) {
                maxLength = n.length();
            }
        }
        System.out.print("Nama terpanjang dari mereka adalah: ");
        for (String n : nama) {
            if (n.length() == maxLength) {
                System.out.print(n + " ");
            }
        }
    }
}
