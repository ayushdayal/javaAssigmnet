package q4;

public class question4 {
    public static void main(String[] args) {
        int a,b,c=0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        for (int i=0;i<13;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c+" ");
        }
    }
}
