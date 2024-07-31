public class recursion4{
    public static void main(String[] args){
        int sum = sum(7867);
        System.out.println(sum);
    }
    
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}