package q3;

public class question3 {
    public static void main(String[] args) {
        System.out.println("legth of string is "+args[0].length()+" string inuppper case "+ args[0].toUpperCase());
        String temp= args[0];
        for (int i=0;i<temp.length()/2;i++)
            if (temp.charAt(i)!=temp.charAt(temp.length()-i))
            {
                System.out.println("is not palindrome ");
                break;
            }
    }
}
