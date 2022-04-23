package sda99.carrental;

public enum CarBrand {

    AUDI("Audi"),
    BMW("BMW"),
    MAZDA("Mazda"),
    MERCEDES_BENZ("Mercedes Benz");

    private String label;


    CarBrand(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
