package com.parkingmanagment;

import javax.sound.midi.Soundbank;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws SQLException, ParseException {


        SqlFun sq = new SqlFun();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car tag and propertise :");
        String tag = sc.nextLine();
        String pro = sc.nextLine();
        System.out.println("Enter car tag and enter time and out time:");
        Double enter=sc.nextDouble();
        Double out=sc.nextDouble();
        Vehicle samand = new Vehicle(tag, pro);
        RequestOut time=new RequestOut(enter,out,tag);
        samand.GetCarTag();
        samand.GetCarPro();
        sq.insertRecord(samand);
        time.getCarTag();
        time.getEnterTime();
        time.getOutTime();
        sq.insertTimeRecord(time);
        sq.SetTotal();


        System.out.println("You wan to pay?(Done/Fail)");
        String m=sc.nextLine();
        AcceptMessage message=new AcceptMessage(tag,m);
        if(m=="Done"){
            message.getAccecpt();
        }
        else if(m=="Fail"){
            message.getAccecpt();
        }
        sq.insertMessage(message);











    }
}
