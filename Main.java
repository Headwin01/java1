package tasks.task415;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество векторов: ");
        int m = scanner.nextInt();
        Vector[] vectors = new Vector[m];
        addCoord(vectors);
    }

    public static boolean compareVectors(Vector v1, Vector v2) {
        if (v1.getX() / v2.getX() == v1.getY() / v2.getY() && v1.getY() / v2.getY() == v1.getZ() / v2.getZ()) {
            return true;
        }
        return false;
    }

    public static boolean complanarniVectors(Vector v1, Vector v2, Vector v3) {
        return v1.getX()*v2.getY()*v3.getZ() + v3.getX()* v2.getZ()*v1.getY() + v2.getX()* v3.getY()*v1.getZ()  -
                (v1.getZ()* v2.getY()* v3.getZ() + v3.getY()*v2.getZ()*v1.getX() + v2.getX()*v1.getY()*v3.getZ()) == 0;
    }

    public static boolean checkOrtogonal(Vector v1, Vector v2) {
        double result = v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
        return result == 0;
    }

    public static void addCoord(Vector[] vectors) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vectors.length; i++) {
            Vector vector = new Vector();
            vector.setX(scanner.nextDouble());
            vector.setY(scanner.nextDouble());
            vector.setZ(scanner.nextDouble());
        }
    }
}
