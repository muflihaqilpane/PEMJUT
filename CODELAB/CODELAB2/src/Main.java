public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.setName("UMM Library");
        lib.setLocation("Malang");
        lib.showLibraryInfo();

        System.out.println();

        Book book1 = new Book("Pemrograman Lanjut", "Wildan Suharso", 10, 120000);
        book1.displayInfo();
    }
}