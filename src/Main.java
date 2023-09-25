public class Main {
    public static void main(String[] args) {
        System.out.println("Print numbers backward:");
        printNumberBackward(9);

        System.out.println("\nPrint numbers forward:");
        printNumber(1, 9);

        System.out.println("\nDemonstrating StackOverflowError:");
        recursiveMethod();
    }

    public static void printNumberBackward(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }

    public static void printNumber(int start, int n) {
        if (start > n) {
            return;
        }
        System.out.print(start + " ");
        printNumber(start + 1, n);
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
