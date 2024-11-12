package ShivaGaur_2215001653_TBPPP;
import java.util.*;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,1);
    }
    public static void func(int n,int n2){
        if(n==n2){
            System.out.print(n2);
            return;
        }
        System.out.print(n2+"+");
        func(n, n2+1);
    }
}
