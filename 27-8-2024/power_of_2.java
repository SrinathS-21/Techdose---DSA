import java.util.*;
public class power_of_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println((n&(n-1))==1?"not power of 2":"power of 2");
    }
}
