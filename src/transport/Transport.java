package transport;

import java.util.Objects;

public abstract class Transport {


    private final String brand;
    private final String model;
    private final int yearProduction;
    private final String countryProduction;
    private String color;
    private int maximumSpeed;
    
    public Transport(String brand, String model, int yearProduction, String countryProduction, String color, int maximumSpeed) {
        if (brand == null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (yearProduction == 0) {
            this.yearProduction = 2000;
        } else {
            this.yearProduction = yearProduction;
        }

        if (countryProduction == null){
            this.countryProduction = "default";
        } else {
            this.countryProduction = countryProduction;
        }

        if (color== null){
            this.color="White";
        } else {
            this.color = color;
        }

        if (maximumSpeed > 0){
            this.maximumSpeed = maximumSpeed;
        } else {
            maximumSpeed = Math.abs(maximumSpeed);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public String getColor() {
        return color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public void setMaximumSpeed(int maximumSpeed) {
        if (maximumSpeed > 0){
            this.maximumSpeed = maximumSpeed;
        } else {
            maximumSpeed = Math.abs(maximumSpeed);
        }
    }

    public abstract void refill();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearProduction == transport.yearProduction && maximumSpeed == transport.maximumSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(countryProduction, transport.countryProduction) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearProduction, countryProduction, color, maximumSpeed);
    }

    @Override
    public String toString() {
        return " Марка, модель: " + brand + " " + model +
                ", год выпуска: " + yearProduction +
                ", страна изготовитель: " + countryProduction +
                ", цвет: " + color +
                ", максимальная скорость: " + maximumSpeed;
    }


}