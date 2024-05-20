
package com.mycompany.mparking;

public class Car extends vehicle  {
    private final  int price=10;

    public Car(int days, int hours) {
        super(days, hours);
    }
    @Override
 public int CalcMoney() {
        return super.CalcMoney()*price;
    }

    
    
    
}
