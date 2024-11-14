
import java.util.*;
public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n,1);
    }
    public static void count(int n,int n2){
        if(n2>n) return;
        count(n,n2+1);
        System.out.print(n2+" ");
    }    
}
