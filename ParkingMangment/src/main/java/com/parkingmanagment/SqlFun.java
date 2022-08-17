package com.parkingmanagment;

import java.sql.*;


public class SqlFun {

    private final String url = "jdbc:postgresql://localhost/ParkingManagment";
    private  final String username="postgres";
    private final  String password="123";
    private static final String INSERT_SQL = "INSERT INTO vehicle" +
            "  (cartag,carpropertise) VALUES " +
            " (?, ?);";

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




}