public class recursion7{
     public static void main(String[] args){
       int counter = helper(902400630);
       System.out.println(counter);
     }
     
     public static int helper(int n){
        return count(n, 0);
     }
     
    public static int count(int n, int a){
        if(n == 0){
            return a;
        }
        int c = n%10;
        if(c == 0){
            return count(n/10, a + 1);
        }
        else{
            return count(n/10, a);
        }
    }
}