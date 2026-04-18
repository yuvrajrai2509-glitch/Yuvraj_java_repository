import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numArray = new int[size];
        double sum = 0.0;

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
          //  System.out.print("Element " + (i + 1) + ": ");
            numArray[i] = scanner.nextInt();
            sum += numArray[i];
        }
        double average = sum / size; 

    
        System.out.println("\nSum of array elements: " + sum);
        System.out.format("Average of array elements: %.2f", average);

        
    }
}
