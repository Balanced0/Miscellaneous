import java.util.ArrayList;
public class recursion13{
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(returnList(arr, 4, 0));
        
    }
    
    public static ArrayList<Integer> returnList(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> finalList = returnList(arr, target, index + 1);
        list.addAll(finalList);
        return list;
    }
}