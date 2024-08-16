import java.util.Scanner;

public class SortingApp {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting strategy: 1. QuickSort 2. MergeSort 3. BubbleSort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setStrategy(new QuickSort());
                break;
            case 2:
                context.setStrategy(new MergeSort());
                break;
            case 3:
                context.setStrategy(new BubbleSort());
                break;
            default:
                System.out.println("Invalid choice. Using default QuickSort.");
                context.setStrategy(new QuickSort());
        }

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        context.sortArray(array);

        System.out.println("Sorted array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}