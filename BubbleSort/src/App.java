import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Bubble Sort Algorithm \n");
        test.testOne();
        test.algorithmName();
        int[] numbers = { 16, 23, 22, 26, 6, 77, 3, 20, 2 };
        System.out.println("Numbers before bubble sort: ");
        for (var i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n\nNumbers after bubble sort: ");
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }
}
