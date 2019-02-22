import java.util.*;

public class Runner {
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        LinkedList<String> mashina = new LinkedList<String>();
//        boolean Mark = true;
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Введите марку: ");
//            String name = sc.nextLine();
//            char[] chars = name.toCharArray();
//            if (Mark) {
//                System.out.println("Может проехать");
//            } else {
//                System.out.println("Марка не подходит) ");
//            }
//            System.out.println("Введите вес: ");
//            int ves = sc.nextInt();
//            if (ves > 3000) {
//                System.out.println("Машина слишком тяжелая ");
//            } else {
//                System.out.println("Машина в допуске по весу ");
//            }
//        }

//        Automat automat = new Automat("автоматическая коробка передач", true);
        Car car = new Mercedes("Мерседес", Colour.WHITE);
        Car car1 = new Bmw("БМВ", Colour.WHITE);
        Car car2 = new Fiat("Фиат", Colour.BLACK);
        Parkovka parkovka = new Parkovka("Парковка");
//        parkovka.addCars(automat);
        parkovka.addCars(car);
        parkovka.addCars(car1);
        parkovka.addCars(car2);
        System.out.println("Белых авто " + parkovka.countCarsOfColour(Colour.WHITE));
        Collections.sort(parkovka.getCars());
        Comparator<Car> coloursComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null) {
                    return -1;
                }
                return o1.getColour().compareTo(o2.getColour());
            }

        };

        parkovka.getCars().sort(coloursComparator);
        System.out.println("Сортировка по марки авто: " + parkovka.getCars());



    }

}

