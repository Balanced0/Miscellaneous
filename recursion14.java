public class recursion14{
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(reverse(arr, 8, 0, arr.length - 1));
    }
    
    public static int reverse(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        
        int m  = s + (e - s)/2;
        
        if(arr[m] == target){
            return m;
        }
        
        if(arr[s] <= arr[e]){
            if(target >= arr[s] && target <= arr[m]){
                return reverse(arr, target, s, m - 1);
            }
            else{
                return reverse(arr, target, m + 1, e);
            }
        }
        
        if(target >= arr[m] && target <= arr[e]){
                return reverse(arr, target, m + 1, e);
            }
            else{
                return reverse(arr, target, e, m - 1);
            }
    }
}