package q6;

import java.util.Arrays;

public class question6 {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6,7,8,9,8,7,6,5,0,0,0,0,0};
        int sum=0,smlst=arr[0];
        for (int i=0;i<14;i++)
        {
            sum+=arr[i];
            if (arr[i]<smlst)
                smlst=arr[i];
        }
        arr[15]=sum;
        arr[16]=sum/14;
        arr[17]=smlst;
        System.out.println(Arrays.toString(arr));
    }
}
