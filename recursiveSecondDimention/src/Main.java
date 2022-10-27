import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        int arr [] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
        System.out.println(recursive(arr , 0 , 8));
        tara.close();


    }

    public static int recursive (int [] arr , int i , int n){
        if(n == 1){
            return arr[i];
        }

        return recursive(arr , i , n/2) + recursive(arr , i + (n/2) , (n/2));
    }


}
