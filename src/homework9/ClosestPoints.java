package homework9;

import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static homework9.Points.findClosestPoints;

/**
 * Java Pro. Homework #9
 * @author Dzmitry Chemel
 * @version 16 June 2023
 */

public class ClosestPoints {
    public static void main(String[] args) {
        List<Points> points = new ArrayList<>();
        points.add(new Points(0,1));
        points.add(new Points(2,2));
        points.add(new Points(5,5));

        int n = 2;

        List<Points> closestPoints = findClosestPoints(points, n);
        System.out.println("Самые близкие точки: ");
        for(Points point:closestPoints){
            System.out.println("(" + point.getX() + "," + point.getY() + ")");
        }
    }

}
