package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();
    private int size;

    public void addPoint(Point a) {
        points.add(a);
        size++;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }
        perimeter += points.get(size - 1).distance(points.get(0));
        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < size - 1; i++) {
            double sideLength = points.get(i).distance(points.get(i + 1));
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        double lastSideLength = points.get(size - 1).distance(points.get(0));
        if (lastSideLength > longestSide) {
            longestSide = lastSideLength;
        }
        return longestSide;
    }

    public double getAverageSideLength() {
        return calculatePerimeter() / size;
    }
}
