public class CloneArr2D {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5}};
        int cloneArray[][] = arr.clone();
        System.out.println(arr==cloneArray);
        System.out.println(arr[0]==cloneArray[0]);
        System.out.println(arr[1]==cloneArray[1]);
    }
}
