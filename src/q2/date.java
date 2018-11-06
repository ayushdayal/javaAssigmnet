/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;


public  class date {
    int date;
    int month;
    int year;
    int checkdate(int dd,int mm,int yy)
    {
        if(yy<0)
            return 0;
        if(mm>12||mm<1)
            return 0;
        if(dd<1)
            return 0;
        switch(mm)
        {
            case 1:
            case 3:    
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(dd>31)
                    return 0;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(dd>30)
                    return 0;
                break;
            case 2:
                if(dd>28)
                    return 0;
                break;
        }
        return 1;
    }
    date(int dd,int mm,int yy)
    {
        int x= checkdate(dd,mm,yy);
        if(x==1)
        {
            date=dd;
            month=mm;
            year=yy;
        }
        else
        {
            System.out.println("Format of the date is incorrect ");
            date=20;
            month= 8;
            year=1998;
        }
        
    }
    date()
    {
        date=20;
        month= 8;
        year=1998;
    }
    void setdate(int dd,int mm,int yy)
    {
        int x= checkdate(dd,mm,yy);
        if(x==1)
        {
            date=dd;
            month=mm;
            year=yy;
        }
        else
        {
            System.out.println("Format of the date is incorrect ");
            date=20;
            month= 8;
            year=1998;
        }
    }
    void adddays(int numDays)
    {

        if(numDays <= 0)
            return;
        int yearDays = 365, numYears = numDays / yearDays;
        year += numYears;
        numDays -= (numYears * yearDays);
        
        
        if(numDays <= 0)
            return;
        
        int monthDays=30;
        int mnths= numDays/monthDays;
        month=month+mnths;
        if(month%12<month)
        {
            year++;
            month=month%12;
        }
        numDays -= (mnths*monthDays);
        
        
        
        
        if(numDays<=0)
            return;
        switch(month)
        {
            case 1:
            case 3:    
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(31-date<numDays)
                {
                    month++;
                    date = numDays-(31-date);
                   
                }
                else
                {
                    date=date+numDays;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(30-date<numDays)
                {
                    month++;
                    date=numDays-(30-date);
                }
                else
                {
                    date=date+numDays;
                }
                break;
            case 2:
                if(28-date<numDays)
                {
                    month++;
                    date=numDays-(28-date);
                }
                else
                {
                    date=date+numDays;
                }
                break;
        }
        
    }
    void printdate()
    {
        System.out.println(date+"/"+month+"/"+year);
    }
           
    
}
