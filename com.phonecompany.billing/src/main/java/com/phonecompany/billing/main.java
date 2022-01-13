package com.phonecompany.billing;



public class main {
    public static void main(String[] args) throws Exception {

      Build bl = new Build();
        String S = bl.setHovor();
       int calculate = bl.calculate(S);
        System.out.println(calculate);
    }
}


