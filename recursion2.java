public class recursion2{
    public static void main(String[] args){
        int product = product(5);
        System.out.println(product);
    }
    
    public static int product(int n){
        if(n <= 1){
            return 1;
        }
        return n * product(n - 1);
    }
}