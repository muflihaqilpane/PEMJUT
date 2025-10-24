public class TestMinFinder {
    public static void main(String[] args) {

        int a1 = 1, b1 = 2, c1 = 3;
        int result1 = MinFinder.findMin(a1, b1, c1);
        System.out.println("Skenario 1: Input = (" + a1 + ", " + b1 + ", " + c1 + ")");
        System.out.println("Expected: 1, Actual: " + result1);

        int a2 = -1, b2 = -2, c2 = -3;
        int result2 = MinFinder.findMin(a2, b2, c2);
        System.out.println("Skenario 2: Input = (" + a2 + ", " + b2 + ", " + c2 + ")");
        System.out.println("Expected: -3, Actual: " + result2);

        int a3 = 0, b3 = 0, c3 = 1;
        int result3 = MinFinder.findMin(a3, b3, c3);
        System.out.println("Skenario 3: Input = (" + a3 + ", " + b3 + ", " + c3 + ")");
        System.out.println("Expected: 0, Actual: " + result3);
    }
}