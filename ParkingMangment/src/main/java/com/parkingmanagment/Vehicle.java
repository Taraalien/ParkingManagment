package com.parkingmanagment;

public class Vehicle {
    String CarTag;
    String CarPro;
    Long id;


   //Constructor
   public Vehicle(String cartag, String carpro){

        CarTag=cartag;
        CarPro=carpro;
        id=id;
    }

    //Setter
   public void SetCarTag(String carTag){
       CarTag=carTag;
   }

   public void SetCarPro(String carPro){
       CarPro=carPro;
   }



    //Getter
    public String GetCarTag(){
       return CarTag;
    }

    public  String GetCarPro(){
       return CarPro;
    }


}
