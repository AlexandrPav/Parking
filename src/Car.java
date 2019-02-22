abstract class Car implements Comparable<Car> {
    private String name;
    private Colour colour;
    private Mark mark;
//    public String korobka;

   Car(String name, Mark mark, Colour colour) {
        this.name = name;
        this.colour = colour;
        this.mark = mark;
    }

//    public Car(String korobka, Colour colour, Mark automat) {
//        this.korobka = korobka;
//    }
//
//    public String getKorobka() {
//        return korobka;
//    }
//
//    public void setKorobka(String korobka) {
//        this.korobka = korobka;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.name);
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}

