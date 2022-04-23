package sda99.carrental;

public class Car {

    private CarBrand brand;       //A/ marka samochodu np. Audi
    private String model;       /// model samochodu np. A5
    private int year;           /// rok produkcji
    private double engineCap;   /// pojemnosc silnika np. 2.0
    private String regNo;      /// numer rejestracyjny

    public Car(CarBrand newBrand, String newModel, int newYear,
               double newEngineCap, String newRegNo){

            brand = newBrand;    /// przypisane zmiennych
            model = newModel;
            year = newYear;
            engineCap = newEngineCap;
            regNo = newRegNo;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public String getRegNo() {
        return regNo;
    }
}
