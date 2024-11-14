import java.util.*;
public class Nthfibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(func(n));
    }
    public static int func(int n){
        if(n==0 || n==1) return 1;
        return func(n-1)+func(n-2);
    }
}
