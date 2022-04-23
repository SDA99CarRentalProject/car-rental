package sda99.carrental.Database;

public class Vehicle {

    private String brand;       /// marka samochodu np. Audi
    private String model;       /// model samochodu np. A5
    private int year;           /// rok produkcji
    private float engineCap;   /// pojemnosc silnika np. 2.0
    private String regNo;      /// numer rejestracyjny

    public Vehicle (String newBrand, String newModel, int newYear,
                    float newEngineCap, String newRegNo){

            brand = newBrand;    /// przypisane zmiennych
            model = newModel;
            year = newYear;
            engineCap = newEngineCap;
            regNo = newRegNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
