public class Main {

    public static void main(String[] args) {
        int sum = 0;

        System.out.println(addUntilN(15 , sum));
    }

    public static int addUntilN (int n , int sum){
        if (n == 0){
            return sum;
        }
        return (addUntilN( n-1 , sum+n));
    }
}
