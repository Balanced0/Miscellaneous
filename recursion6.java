public class recursion6{
    public static void main(String[] args){
        reverse(987654321);
    }
    
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        int a = n%10;
        System.out.print(a);
        reverse(n/10);
    }
}