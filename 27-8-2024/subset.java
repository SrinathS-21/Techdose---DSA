import java.util.*;
public class subset {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        sub(list);
    }

    public static void sub(List<Integer> list) {
        int n=list.size();
        int count=1<<n;

        for(int i=0; i<count; i++) 
        {
            List<Integer> subset = new ArrayList<Integer>();
            for(int j=0; j<n;j++)
            {
                if((i&(1<<j))!=0){
                    subset.add(list.get(j));
                }
            }
            System.out.print("{ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("}");
        }
    }
}
