package q9;

import java.util.Random;

public class testMediciene {
    public static void main(String[] args) {
        Medicine medicine[]= new Medicine[10];
        Random random= new Random();
        int d;
        for (int i=0;i<10;i++)
        {
            d = random.nextInt(3);
            if (d%3==0)
                medicine[i]=new Syrup();
            if (d%3==1)
                medicine[i]= new Tablet();
            if (d%3==2)
                medicine[i]= new Ointment();
            medicine[i].dsisplayLabel();
        }
    }
}
