public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(6));
        // fibonacci dizisindeki 6. sayıyı bize verecek
        // fibonacci dizisi:  1 1 2 3 5 8 13 21 ...
    }

    public static int fibonacci (int n){
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
