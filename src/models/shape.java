import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> vertices = new ArrayList<Point>();
    private int numVertices;

    public void addPoint(Point vertex) {
        vertices.add(vertex);
        numVertices++;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        perimeter = vertices.get(0).distance(vertices.get(numVertices - 1));
        Point lastVertex = vertices.get(0);
        for (int i = 1; i < numVertices; i++) {
            perimeter += lastVertex.distance(vertices.get(i));
            lastVertex = vertices.get(i);
        }
        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        Point lastVertex = vertices.get(0);
        longestSide = lastVertex.distance(vertices.get(numVertices - 1));
        for (int i = 1; i < numVertices; i++) {
            longestSide = Math.max(longestSide, lastVertex.distance(vertices.get(i)));
            lastVertex = vertices.get(i);
        }
        return longestSide;
    }

    public double getAverageSideLength() {
        return calculatePerimeter() / numVertices;
    }
}


