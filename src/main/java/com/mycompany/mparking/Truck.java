
package com.mycompany.mparking;

public class Truck extends vehicle{
     private final  int price=15;

    public Truck(int hours,int days) { 
    super(hours,days);
    }

     @Override
  public int CalcMoney() {
        return price*super.CalcMoney();
    }
}
