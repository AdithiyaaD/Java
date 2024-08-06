public class MethodArray {
    public static void main(String[] args){
        int arr[]={3,1,2,4,5};
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements: "+sum);
    }
}
