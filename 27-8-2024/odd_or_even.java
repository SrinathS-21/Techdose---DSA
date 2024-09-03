import java.util.*;

public class odd_or_even 
{
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int x=in.nextInt();
            System.out.println((x&1) == 1?"odd":"even");
        }
}
