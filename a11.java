import java.util.Scanner;

class a11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. User se input lein
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        int left = 0;
        int right = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[left] = arr[i];
                left++;
            } else {
                temp[right] = arr[i];
                right--;
            }
        }
        
        
        System.out.println("Rearranged Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        
        
    }
}

