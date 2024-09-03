import java.util.*;
public class set_bits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(setbits(n,2));
    }

public static int setbits(int num,int i)
    {
        num=num>>(i-1);
    return num&1;
    }
}
