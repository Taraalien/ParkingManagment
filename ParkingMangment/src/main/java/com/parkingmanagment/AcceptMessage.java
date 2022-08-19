package com.parkingmanagment;

public class AcceptMessage {

    String CarTag;
    String Accecpt;


    public AcceptMessage(String carTag, String accecpt) {
        CarTag = carTag;
        Accecpt = accecpt;
    }

    public void setCarTag(String carTag) {
        CarTag = carTag;
    }

    public void setAccecpt(String accecpt) {
        Accecpt = accecpt;
    }

    public String getCarTag() {
        return CarTag;
    }

    public String getAccecpt() {
        return Accecpt;
    }
}
