
package com.mycompany.mparking;
public class motorcycle extends vehicle {
     private final  int price=5;

    public motorcycle (int days,int hours) { 
    super(days,hours);
    }
     @Override
    public int CalcMoney( ) {
      
        return price*super.CalcMoney();
    
}
}
