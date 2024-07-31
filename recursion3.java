public class recursion3{
    public static void main(String[] args){
        int sum = sum(5);
        System.out.println(sum);
    }
    
    public static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}