package homework9;

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
}
