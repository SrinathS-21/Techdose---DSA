import java.util.*;
public class set_ith_bit {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(setbits(n,2));
    }

public static int setbits(int num,int i)
    {
    return num | (1<<(i-1));
    }
}
