package com.phonecompany.billing;


import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;


public class Build {

    public double costfirs = 0.50;
    public double costNext = 0.20;
    public int sec;


    public int calculate(String s) throws Exception {
        ArrayList<String> time = new ArrayList();
        time.add(setHovor());
        time.add(String.valueOf(getPrice()));
        return 0;

    }





    public String setHovor() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("hovor.csv"));
        String b;
        while ((b = bf.readLine()) != null) {

        }
        return b;
    }

    public int getPrice() {
        if (sec < 300) {
            return (int) (sec * costfirs);
        } else if (sec > 300) {
            return (int) (sec * costNext);
        } else return sec * 1;
    }

    public String setDate() throws Exception {
        String dates = setHovor();
        SimpleDateFormat sp = new SimpleDateFormat("dd-mm-yyy hh:mm:ss");
        Date date = sp.parse(dates);
        SimpleDateFormat sp1 = new SimpleDateFormat("00:00:00");
        return sp1.format(date);
    }


    

}



