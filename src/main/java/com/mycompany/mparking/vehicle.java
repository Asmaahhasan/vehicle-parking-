package com.mycompany.mparking;

import java.util.*;

public  class vehicle {
     private static final String [] s= new String [101];
   protected static String id;
    protected static int length;
   protected static String type;
    protected static int days;
    protected static int hours;
   protected static int area=100;
 protected static int busyarea =0;  
    public  vehicle(int days,int hours) {}
    
        public static void add(Scanner scanner)
    {    if(area==0)
    {  System.out.println(" No space Available");  return ; }
            System.out.print("Enter 1 for motorcycle"+"\n"+"Enter 2 for car"+
             "\n"+"Enter 3 for Truck"+"\n"+"Enter 4 for Bus"+"\n");
    int x;
   x=scanner.nextInt();
        System.out.println("enter id");
      String d =scanner.next();
        
        vehicle.id = d;
        switch (x) {
            case 1:
                vehicle. length=2 ;
                break;
            case 2:
                vehicle. length=5 ;
                break;
            case 3:
                vehicle. length=7 ;
                break; 
            case 4:
                vehicle. length=10 ;
                break;
            default:
                break;
        }
        
       int ch=0;
       boolean e=false;
        for(int i=0; i<100; i++)
        { 
        if((s[i]==null)&&i+length<=100)
         {  ch=1;
       for( int j=i;  j<i+length;  j++)
             {  if(s[j] == null){}
               else { ch=0; break; } 
             }
      if(ch==1)   {
          for( int g=i;  g<i+length;  g++){  s[g]=id; }
     e=true;
      break;
      }
         }
        if(e)
            break;
        }
        if(ch==0)
            System.out.println(" No space Available");       
        else
        {      System.out.println(id+"   was parked");
         area=area-length;
      busyarea=busyarea+length;
      // System.out.println(area+"   is free   "+busyarea+"   is busy");
        }   
        
    }
        
        public int CalcMoney() {
        return hours+(24*days);
    }
        
        public static void remove(Scanner scanner)
                {
                     int c;
                          System.out.println("enter id");
      String d =scanner.next();
      c=0;
         vehicle.id=d;
                    for (int i = 0; i <= 100; i++) {
                        
                        if(!id.equals(s[i]))
                        {
                       
                       } else {
                            s[i]=null;
                            c++;
                         }
                        if(c==10)
                            break;
                    }
                      if(c==0)
                        System.out.println(id+" not exist");
                    else
                    {
                       vehicle. length=c;
                    System.out.println("Enter Days and Hour");
                    days=scanner.nextInt();
                    hours=scanner.nextInt();
        vehicle.area=area+length;
       vehicle.busyarea=busyarea-length;
      switch (length) {
            case 2:
                motorcycle m= new motorcycle(days,hours);
                System.out.println( "the price is "+m.CalcMoney()+" $ ");
                break;
            case 5:
                Car c1=new Car(days,hours);
                System.out.println( "the price is "+c1.CalcMoney()+ " $ ");
                break;
            case 7:
                Truck t=new Truck(days,hours);
                System.out.println( "the price is "+t.CalcMoney() + " $");
                break;
            case 10:
                Bus b=new Bus(days,hours);
                System.out.println( "the price is "+b.CalcMoney() + " $");
                break;
            default:
                break;
        }
        }}
         public static void are()
         {
            System.out.println(area+"   is free   "+busyarea+"   is busy");
         
         }
   
}
