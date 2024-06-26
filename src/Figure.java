import java.util.Objects;

class Figure {
    public double area(){
        return 0.0;
    }

    public boolean equalArea(Figure obj) {
        return (obj.area() == this.area());
    }
}
class Circle extends Figure{
    private double radius;
    Circle(){
        radius = 0.0;
    }
    Circle(double r){
        this.radius = r;
    }
    public void setRadius(double r){
        radius = r;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Figure{
    private double widht,length;
    Rectangle(){
        widht = 0.0;
        length = 0.0;
    }
    Rectangle(double w, double l){
        this.widht = w;
        this.length = l;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidht(double widht) {
        this.widht = widht;
    }

    @Override
    public double area(){
        return widht*length;
    }
}
class Triangle extends Figure{
    private double a,b,c;
    Triangle(){
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static boolean checkIfExists(double a, double b, double c){
        if (a<b+c && b<a+c && c<a+b) return true;
        else return false;
    }
    public void setSides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        return Math.sqrt(this.halfPer()*(this.halfPer()-a)*(this.halfPer()-b)*(this.halfPer()-c));
    }
    public double halfPer(){
        return a+b+c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(a, triangle.a) == 0 && Double.compare(b, triangle.b) == 0 && Double.compare(c, triangle.c) == 0;
    }


    @Override
    public String toString() {
        return "Triangle {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}