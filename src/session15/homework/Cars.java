package session15.homework;

public enum Cars {

    CAR_ONE("truck", 100000.99, "Volvo"),
    CAR_TWO("Sport car", 500000.0, "Ferrari"),
    CAR_THREE("Family Car", 30000.88, "Renault");

    private final String type;
    private final double avgPrice;
    private final String manufacturer;

    Cars(String type, double avgPrice, String manufacturer) {
        this.type = type;
        this.avgPrice = avgPrice;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car type: " + type + "\n" +
                "Average Price: " + avgPrice + "\n" +
                "Manufacturer:" + manufacturer + "\n";
    }
}

class Showroom {

    public static void main(String[] args) {
        System.out.println(Cars.CAR_ONE);
        System.out.println(Cars.CAR_TWO);
        System.out.println(Cars.CAR_THREE);
    }
}
