package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private Float engineVolume;
    private String color;
    private final int yearProduction;
    private final String countryProduction;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatsNumber;
    private boolean winterTyres;
    public static Key key;
    public static  Insurance insurance;



    public Car(String brand, String model, Float engineVolume, String color,
               int yearProduction, String countryProduction, String transmission,
               String bodyType, String regNumber, int seatsNumber, boolean winterTyres) {

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

        if (engineVolume == null) {
            this.engineVolume = 1.5f;
        }else {
            this.engineVolume = engineVolume;
        }

        if (color== null){
            this.color="White";
        } else {
            this.color = color;
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

        if (transmission == null) {
            this.transmission = "Неизвестно";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null) {
            this.bodyType = "Неизвестно";
        } else {
            this.bodyType = bodyType;
        }

        if (regNumber == null) {
            this.regNumber = "х000хх000";
        }else {
            this.regNumber = regNumber;
        }

        if (seatsNumber == 0) {
            this.seatsNumber = 5;
        } else {
            this.seatsNumber = seatsNumber;
        }

        this.winterTyres = winterTyres;

        if (key == null){
            this.key = new Key();
        } else {
            this.key=key;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {

        if (transmission != null) {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setRegNumber(String regNumber) {

        if (regNumber != null) {
            this.regNumber = regNumber;
        }else {
            regNumber = "х000хх000";
        }
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    public void changeTyres() {
        winterTyres = !winterTyres;
    }

    @Override
    public String toString() {
        return " Марка, модель: "+brand + " " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color +
                ", год выпуска: " + yearProduction + ", страна изготовитель: " + countryProduction + ", трансмиссия: "
                + transmission + ", тип кузова: " + bodyType + ", регистрационный номер: " + regNumber +
                ", количество мест: " + seatsNumber + ", зимняя резина: " + winterTyres;
    }

    public void printCar() {
        System.out.println(toString());
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char [] chars = regNumber.toCharArray();

        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6])|| !Character.isDigit(chars[7])|| !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessStart;
        public Key(boolean remoteEngineStart, boolean keylessStart) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessStart = keylessStart;
        }
        public Key(){
            this(false,false);
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessStart() {
            return keylessStart;
        }
    }

    public static class Insurance {

        private LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {

            this.expireDate = expireDate;
            this.cost = Math.max(cost, 1f);
            if (number ==null){
                this.number="000000000";
            } else {
                this.number = number;
            }
        }

        public boolean isNumberValid() {
        return number.length()==9;
        }

        public boolean isInsuranceValid(){
            return LocalDate.now().isBefore(this.expireDate);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}

