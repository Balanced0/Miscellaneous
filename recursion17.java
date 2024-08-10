import java.util.Arrays;
public class recursion17{
    public static void main(String[] args){
        int[] arr = {4, 3, 2, 1}; 
        bubble(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubble(int[] arr, int n, int index){
        if(n <= 1){
            return;
        }
        
        if(index >= n - 1){
            bubble(arr, n - 1, 0);
                return;
        }
        if(arr[index] > arr[index + 1]){
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
        bubble(arr, n, index + 1);
    }
}