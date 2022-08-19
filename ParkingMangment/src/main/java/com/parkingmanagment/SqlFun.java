package com.parkingmanagment;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.util.Date;


public class SqlFun {

    private final String url = "jdbc:postgresql://localhost/ParkingManagment";
    private  final String username="postgres";
    private final  String password="123";
    private static final String INSERT_SQL = "INSERT INTO vehicle" +
            "  (cartag,carpropertise) VALUES " +
            " (?, ?);";
    private static final String INSERT_TIME="INSERT INTO parking"+
            "(cartag,enter_time,out_time) VALUES"+"(?,?,?);";
    private static final String INSERT_Message="INSERT INTO accept_message"+
            "(cartag,accept) VALUES"+"(?,?);";
    private static final String SELECT_TOTAL="SELECT * FROM parking;";



    public  void insertRecord(Vehicle car) throws SQLException {
        System.out.println(INSERT_SQL);

        try (Connection connection = DriverManager.getConnection(url, username, password);


             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {

            preparedStatement.setString(1,car.GetCarTag() );
            preparedStatement.setString(2, car.GetCarPro());


            System.out.println(preparedStatement);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {



        }

    }





    public void insertTimeRecord(RequestOut rq) throws SQLException{
        System.out.println(INSERT_TIME);
        try(Connection cn=DriverManager.getConnection(url,username,password);
        PreparedStatement pt=cn.prepareStatement(INSERT_TIME)){

            pt.setString(1,rq.getCarTag());
            pt.setDouble(2,rq.getEnterTime());
            pt.setDouble(3,rq.getOutTime());

            System.out.println(pt);
            pt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public void SetTotal(){

        try(Connection cn=DriverManager.getConnection(url,username,password);

            Statement st=cn.createStatement();
            ResultSet set=st.executeQuery(SELECT_TOTAL);
            ){

            while (set.next()){
                System.out.println(set.getDouble("total"));
            }
        }catch (SQLException e){e.printStackTrace();}





    }


    public void insertMessage(AcceptMessage am) throws SQLException{
        System.out.println(INSERT_Message);
        try(Connection cn=DriverManager.getConnection(url,username,password);
            PreparedStatement pt=cn.prepareStatement(INSERT_Message)){

            pt.setString(1,am.getCarTag());
            pt.setString(2,am.getAccecpt());

            System.out.println(pt);
            pt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }



    }







