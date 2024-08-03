import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = myobj.nextInt();
        int arr[] = new int[n];
        int i, j;
        if (n < 3) {
            System.out.println("The array must have minimum 3 elements");
        } 
        else {
            for (i = 0; i < n; i++) {
                arr[i] = myobj.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("The third largest number is %d", arr[n - 3]);
        myobj.close();
    }
}
