import transport.Car;
public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada","Granta",1.7f, "Yellow",
                2015, "Россия","МКПП", "седан",
                "а345аа178", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "Black",
                2020,"Германия",
                null, null, null, 0, false);
        Car bmw = new Car("BMW", "Z8", 3.0f, "Black",
                2021, "Германия",
                null, null, null, 0, false);
        Car kia = new Car("Kia", "Sportage  4-го поколения", 2.4f, "Red",
                2018, "Южная Корея",
                null, null, null, 0, false);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "Orange",
                2016,"Южная Корея",
                null, null, null, 0, false);

        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();

    }
}