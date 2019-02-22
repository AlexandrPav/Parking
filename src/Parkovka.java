import java.util.ArrayList;
import java.util.List;

public class Parkovka {
    private String name;
    private List<Car> cars = new ArrayList<>(5);

    public Parkovka(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    Parkovka(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    List<Car> getCars() {

        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    void addCars(Car car) {
        cars.add(car);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int countCarsOfColour(Colour colour) {
        int counter = 0;
        for (Car car : cars) {
            if (colour == car.getColour()) {
                counter++;
            }
        }
        return counter;
    }
//    public int countAutomat(String korobka) {
//        int counter = 0;
//        for (Car car : cars) {
//            if (korobka == car.getKorobka()) {
//                counter++;
//            }
//        }
//        return counter;
//    }
}

