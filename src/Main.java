import transport.Bus;
import transport.Car;
import transport.Train;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                "Lada",
                "Granta",
                2015,
                "Россия",
                "Yellow",
                120,
                1.7f,
                "МКПП",
                 "седан",
                "а345аа178",
                5,
                true);

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "Black",
                150,
                3.0f,
                null,
                null,
                null,
                5,
                false);

        Car bmw = new Car(
                "BMW",
                "Z8",
                2021,
                "Германия",
                "Black",
                170,
                3.0f,
                null,
                null,
                null,
                0,
                false);

        Car kia = new Car(
                "Kia",
                "Sportage  4-го поколения",
                2018,
                "Южная Корея",
                "Red",
                150,
                2.4f,
                null,
                null,
                null,
                0,
                false);

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южная Корея",
                "Orange",
                100,
                1.6f,
                null,
                null,
                null,
                0,
                false);
        new Car.Key (true, true);
        new Car.Insurance(LocalDate.now().plusMonths(6), 30000, "123456789");


        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();

        Train lastochka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                3500,
                4,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);


        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                "black",
                270,
                1700,
                5,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);


       Bus mersedes = new Bus(
               "Мерседес",
               "OC 500 LE",
               2020,
               "Германия",
               "white",
               150);

        Bus liaz = new Bus(
                "Лиаз",
                "5256",
                2018,
                "Россия",
                "white",
                100);

        Bus paz = new Bus(
                "ПАЗ",
                "4234",
                2000,
                "Россия",
                "grey",
                120);


        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println(mersedes);
        System.out.println(liaz);
        System.out.println(paz);

        lada.refill();
        liaz.refill();
        lastochka.refill();
    }
}