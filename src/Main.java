import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fname = "input.txt";
        ArrayList<Triangle> x = readTrianglesFromFile(fname);
        System.out.println(x);
        System.out.println(sumAreaForList(x));
        fname = "input2.txt";
        ArrayList<Triangle> y = readTrianglesFromFile(fname);
        System.out.println(y);
        System.out.println(findUniqueTriangles(x,y));
    }
    public static ArrayList<Triangle> readTrianglesFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Triangle> list = new ArrayList<>();
        while (scanner.hasNext()){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if (Triangle.checkIfExists(a,b,c)){
                list.add(new Triangle(a,b,c));
            }
        }
        scanner.close();
        return list;
    }
    public static double sumAreaForList(ArrayList<Triangle> list){
        double sum = 0;
        for (Triangle x: list){
            sum += x.area();
        }
        return sum;
    }
    public static ArrayList<Triangle> findUniqueTriangles(ArrayList<Triangle> x, ArrayList<Triangle> y){
        ArrayList<Triangle> t = new ArrayList<>();
        for (Triangle i: x) {
            if (!y.contains(i))
                t.add(i);
        }
        return t;
    }
}