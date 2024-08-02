public class recursion10{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int ans = linear(arr, 5, 0);
        System.out.println(ans);
    }
    
    public static int linear(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        else{
            return linear(arr, target, index + 1);
        }
        
    }
}