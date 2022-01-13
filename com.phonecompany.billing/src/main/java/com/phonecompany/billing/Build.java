package com.phonecompany.billing;


import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Build {

    public double costfirs = 0.50;
    public double costNext = 0.20;
    public int sec;


    public String setHovor() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("hovor.csv"));
        String s;
        while ((s = bf.readLine()) != null) {

        }
        return s;
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



