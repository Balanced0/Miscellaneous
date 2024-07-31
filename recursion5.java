public class recursion5{
    public static void main(String[] args){
        int product = product(7867);
        System.out.println(product);
    }
    
    public static int product(int n){
        if(n <= 1){
            return 1;
        }
        return (n%10) * product(n/10);
    }
}