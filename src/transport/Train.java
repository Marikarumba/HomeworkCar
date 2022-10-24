package transport;

public class Train extends Transport {

    private float price;
    private int travelTime;
    private String departureStation;
    private String finalStation;
    private int carriageCount;

    public Train(String brand,
                 String model,
                 int yearProduction,
                 String countryProduction,
                 String color,
                 int maximumSpeed,
                 float price,
                 int travelTime,
                 String departureStation,
                 String finalStation,
                 int carriageCount) {
        super(brand, model, yearProduction, countryProduction, color, maximumSpeed);
        this.price = Math.max(price, 1.0f);
        this.travelTime = Math.max(travelTime, 1);

        if (departureStation != null) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = "Default";
        }

        if (finalStation != null) {
            this.finalStation = finalStation;
        } else {
            this.finalStation = "Default";
        }
        this.carriageCount = Math.max(carriageCount, 1);
    }

    public float getPrice() {
        return price;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setPrice(float price) {
        this.price = Math.max(price, 1.0f);
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = "Default";
        }
    }

    public void setFinalStation(String finalStation) {
        if (finalStation != null) {
            this.finalStation = finalStation;
        } else {
            this.finalStation = "Default";
        }
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = Math.max(carriageCount, 1);
    }

    @Override
    public String toString() {
        return "Поезд. " + super.toString() +
                ", цена: " + price +
                ", время в пути: " + travelTime +
                ", станция прибытия: " + departureStation +
                ", станция отправления: " + finalStation +
                ", количество вагонов: " + carriageCount;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }

}

