import java.util.ArrayList;
public class recursion11{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 4, 6};
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(target == arr[index]){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}