public class recursion8{
     public static void main(String[] args){
       int counter = helper(41);
       System.out.println(counter);
     }
     
     public static int helper(int n){
        return count(n, 0);
     }
     
    public static int count(int n, int a){
        if(n == 0){
            return a;
        }
        if(n%2 == 0){
            return count(n/2, a+1);
        }
        else{
            return count(n-1, a+1);
        }
    }
}