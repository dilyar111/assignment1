package models;
import java.lang.Math;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other){
        return Math.sqrt((this.getX() - other.getX())*(this.getX() - other.getX()) +
                (this.getY() - other.getY())*(this.getY() - other.getY()));
    }

    public String toString(){
        return "Point at x: " + String.valueOf(x) + " y: " + String.valueOf(y) + '\n';
    }
}
