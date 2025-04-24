import java.util.ArrayList;

public class TestAbstractShapes {
    public static void main(String[] args) {
        Shape rectangular = new Rectangular(3,4);
        System.out.println(rectangular.area());
        System.out.println(rectangular.perimeter());
        System.out.println(rectangular);

        Rectangular rectangular1 = new Rectangular(3,4);
        System.out.println(rectangular1.area());
        System.out.println(rectangular1.perimeter());
        System.out.println(rectangular1);

        Shape square = new Rectangular(3,3);
        System.out.println(rectangular.area());
        System.out.println(rectangular.perimeter());
        System.out.println(square);

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(rectangular);
        shapes.add(rectangular1);
        shapes.add(square);

        for (int i = 0; i < 3; i++) {
            System.out.println(shapes.get(i));
        }
    }
}
