package homework9;

import java.util.Comparator;
import java.util.List;

public class Points {
    private int x;
    private int y;

    public Points (int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistanceToStart(){
        return Math. sqrt(x * x + y * y);
    }

    public static List<Points> findClosestPoints(List<Points> points, int n){
        points.sort(Comparator.comparingDouble(Points::getDistanceToStart));

        return points.subList(0,Math.min(n, points.size()));
    }
}
