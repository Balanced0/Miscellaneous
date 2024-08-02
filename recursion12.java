import java.util.ArrayList;
public class recursion12{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 4, 6};
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }
    
    public static ArrayList<Integer> findAllIndex(int[] arr, int target,int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}