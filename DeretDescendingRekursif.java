public class DeretDescendingRekursif {

    public static void recursiveSeries(int number) {
        if (number >= 0) {
            System.out.print(number + " ");
            recursiveSeries(number - 1);
        }
    }

    public static void iterativeSeries(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Recursive series: ");
        recursiveSeries(5);
        System.out.print("\nIterative series: ");
        iterativeSeries(5);
    }
}
