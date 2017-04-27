/**
 * Created by Dave on 4/27/17.
 */

class Point {

    private int x;
    private int y;

    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Rectangle {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    private double distanceFormula(Point p1, Point p2) {
        int changeX = p1.getX() - p2.getX();
        int changeY = p1.getY() - p2.getY();

        double squaredChangeX = Math.pow(changeX, 2);
        double squaredChangeY = Math.pow(changeY, 2);

        return Math.sqrt(squaredChangeX + squaredChangeY);
    }

    public double[] getSides() {

        double [] sides = new double[2];
        sides[0] = distanceFormula(p1, p2);
        sides[1] = distanceFormula(p2, p3);

        return sides;
    }


    public double calculateArea() {
        double s1 = distanceFormula(p1, p2);
        double s2 = distanceFormula(p2, p3);

        return  s1 * s2;
    }

    public double altCalculateArea() {
        double[] s = getSides();

        double s1 = s[0];
        double s2 = s[1];

        return  s1 * s2;
    }
}



class Testa {
    // this runs the program so main method

    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(0, 5);

        Rectangle myRectangle = new Rectangle(p1, p2, p3, p4);

        System.out.println(myRectangle.calculateArea());
        double[] mySides = myRectangle.getSides();

        for(double x: mySides) {
            System.out.println(x);
        }

        for (int i = 0; i < mySides.length; i++) {
            System.out.println(mySides[i]);
        }

        System.out.println(myRectangle.altCalculateArea());
    }
}
