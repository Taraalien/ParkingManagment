package com.parkingmanagment;

import java.text.DecimalFormat;

public class RequestOut {
    Double EnterTime;
    Double OutTime;
    String CarTag;



    public RequestOut(Double enterTime,Double outTime,String carTag){

        EnterTime=enterTime;
        OutTime=outTime;
        CarTag=carTag;
    }

    //setter
    public void SetEnterTime(Double timein){
        EnterTime=timein;
    }

   public  void SetOutTime(Double timeout){
        OutTime=timeout;

   }

    public  void SetCartag(String cart){
        CarTag=cart;

    }


   //getter


    public Double getEnterTime() {
        return EnterTime;
    }

    public Double getOutTime() {
        return OutTime;
    }

    public String getCarTag() {
        return CarTag;
    }
}
