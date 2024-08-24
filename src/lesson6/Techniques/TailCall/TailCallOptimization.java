package lesson6.Techniques.TailCall;

public class TailCallOptimization {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(tailCallFactorial(4, 1L));

    }

    private static long factorial(long n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    private static long tailCallFactorial(int n, long result){
        if(n == 0){
            return result;
        }else{
            return tailCallFactorial(n-1, n*result);
        }
    }
}
