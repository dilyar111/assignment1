package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();
    private int size;
    public void addPoint(Point a){
        points.add(a);
        size++;
    }

    public double calculatePerimeter(){
        double res = 0;
        res = points.get(0).distance(points.get(size - 1));
        Point prev = points.get(0);
        for(int i = 1; i < size; i++){
            res += prev.distance(points.get(i));
            prev = points.get(i);
        }
        return res;
    }
    public double getLongest(){
        double res = 0;
        Point prev = points.get(0);
        res = prev.distance(points.get(size - 1));
        for(int i = 1; i < size; i++){
            res = Math.max(res,prev.distance(points.get(i)));
            prev = points.get(i);
        }
        return res;
    }
    public double getAverageSide(){
        return calculatePerimeter()/size;
    }
}