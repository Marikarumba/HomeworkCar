package transport;

public class Bus extends Transport{

    public Bus(String brand,
               String model,
               int yearProduction,
               String countryProduction,
               String color,
               int maximumSpeed) {
        super(brand, model, yearProduction, countryProduction, color, maximumSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }


    @Override
    public String toString() {
        return "Автобус. " + super.toString();
    }


}
