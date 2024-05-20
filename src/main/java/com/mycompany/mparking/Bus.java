package com.mycompany.mparking;
public class Bus  extends vehicle {
     private final  int price=15;

    public Bus(int hours,int days) { 
    super(hours,days);
    }
     @Override
    public int CalcMoney( ) {

        return super.CalcMoney()*price;
    
}}
