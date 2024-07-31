public class recursion{
    public static void main(String[] args){
        descending(5);
    }
    
    public static int descending(int n ){
        if(n <= 1){
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return descending(n - 1);
    }
}