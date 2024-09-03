public class swap {
    public static void main(String[] args){
        int a=5;
        int b=8;
        a^=b;
        b^=a;
        a^=b;
    System.out.println("After Swapping a: "+a+" b: "+b);
    }
}
