import org.w3c.dom.ls.LSOutput;
import transport.Car;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Люди");
        Human ann = new Human(2022 - 29, "Аня", "Москва", "методист образовательных программ");
        System.out.println(ann);

        Human kate = new Human(2022 - 28, "Катя", "Москва", null);
        System.out.println(kate);

        Human artem = new Human(2022 - 27, "Артем", "", "директор по развитию бизнеса");
        System.out.println(artem);

        Human vladimir = new Human();
        vladimir.name = "Владимир";
        vladimir.job = "Безработный";
        vladimir.setYearOfBirth(2022 - 21);
        vladimir.setTown("Казань");
        System.out.println(vladimir);
        System.out.println("***\n\nЦветы");
        Flower rose = new Flower("Роза", "", "Голландия", 35.59, -1);
        Flower hrizantem = new Flower("Хризантема", "", null, 15, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(hrizantem);

        Map<Flower, Integer> bouquet = new HashMap<>();
        bouquet.put(rose, 7);
        bouquet.put(hrizantem, 3);
        bouquet.put(pion, 5);
        viewBouquet(bouquet);
        System.out.printf("Стоимость букета %.2f рублей.%n", getBouquetCost(bouquet));
        System.out.printf("Букет будет стоять %d дня(ей).%n", getBouquetLifeSpan(bouquet));
        System.out.println("***\n\nМашины");

        Car car = new Car("VW","Tiguan", 2.0f, "silver", 2020,
                "Germany", false, "SUV", "A123BC199", 5);
        System.out.println(car);
        car.checkIdNumber();
        car.addRemoteStart();
        car.addKeylessEntry();
        System.out.println(car);
        car.removeRemoteStart();
        System.out.println(car);
        car.checkInsurance();
        Car.Insurance insurance = new Car.Insurance(180,6789.12, "ABC123456");
        System.out.println("Сейчас произойдет создание плохой страховки!");
        Car.Insurance badInsurance = new Car.Insurance(180,6789.12, "ABC12345");
        System.out.println("Проверка страховки по умолчанию.");
        car.checkInsurance();
        System.out.println("Проверка новой \"плохой\" страховки.");
        car.setInsurance(badInsurance);
        car.checkInsurance();
        System.out.println("Проверка новой \"хорошей\" страховки.");
        car.setInsurance(insurance);
        car.checkInsurance();
        System.out.println("***");


    }

    static double getBouquetCost(Map<Flower, Integer> map) {
        double result = 0;
        for (Flower flower : map.keySet()) {
            result += flower.getCost() * map.get(flower);
        }
        result *= 1.1;
        return result;
    }

    static int getBouquetLifeSpan(Map<Flower, Integer> map) {
        int result = Integer.MAX_VALUE;
        for (Flower flower : map.keySet()) {
            result = Math.min(result, flower.lifeSpan);
        }
        return result;
    }

    static void viewBouquet(Map<Flower, Integer> map) {
        System.out.println("Состав букета:");
        for (Flower flower : map.keySet()) {
            System.out.println(flower.name + " в количестве " + map.get(flower) + " шт.");
        }
        //System.out.print("\n");
    }
}