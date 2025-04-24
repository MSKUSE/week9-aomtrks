public class Rectangular extends Shape{
    private int sideA = 0, sideB = 0;

    @Override
    public String toString() {
        return "Rectangular{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public Rectangular(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangular(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

}
