package sda99.carrental;

import java.util.ArrayList;
import java.util.List;

public class CarRent {

    public static void main(String[] args) {
        List vehicleList = new ArrayList();

        vehicleList.add(new Vehicle("BMW", "X5", "2020", "5.0", "PO 12345"));
        vehicleList.add(new Vehicle("Audi", "A5", "2018", "2.0", "ZS 76532"));
        vehicleList.add(new Vehicle("Mazda", "CX-5", "2022", "2.0", "DW 09313"));

    }

}