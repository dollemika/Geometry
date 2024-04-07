public class Main {
    public static void main(String[] args) {
        Figure f1 = new Figure();
        Circle c1 = new Circle();
        c1.setRadius(2);
        Figure f2 = new Circle(2);
        System.out.println(f1.area());
        System.out.println(c1.area());
        System.out.println(f2.equalArea(c1));
        Rectangle r1 = new Rectangle(2,3);
        Triangle t1 = new Triangle(2,3,5);
        System.out.println(r1.equalArea(t1));
    }
}