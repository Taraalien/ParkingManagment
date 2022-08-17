package com.parkingmanagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)throws SQLException{

      SqlFun sq=new SqlFun();
      Scanner sc=new Scanner(System.in);
      String tag=sc.nextLine();
      String pro= sc.nextLine();
     Vehicle samand=new Vehicle(tag,pro);
     samand.GetCarTag();
     samand.GetCarPro();
     sq.insertRecord(samand);



    }
}
