package com.phonecompany.billing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.math.BigDecimal;

public class main {
    public static void main(String[] args) throws Exception {
      Build bl = new Build();

        System.out.println(bl.getPrice());
    }
}


