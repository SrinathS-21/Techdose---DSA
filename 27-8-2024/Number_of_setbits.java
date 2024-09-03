import java.util.*;

public class Number_of_setbits{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isset(n));
    }

public static int isset(int num)
    {
        int count=0;
        while(num>0)
            {
                num=num&(num-1);
                count++;
            }
    return count;
}
}