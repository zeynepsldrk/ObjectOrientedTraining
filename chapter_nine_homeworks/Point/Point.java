package Point;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*point in orjin e uzaklığını ve başka bir pointe uzaklığını hesaplayan iki metot
    * aynı point i klonlayan başka bir metot
    * move metodunda x veya y yönünde hareket edecek
    * iki tane point nesnesi ile denemeler yap*/

    public double calculateDistanceOfOrigin()
    {
        return (Math.sqrt((x * x) + (y * y)));
    }

    public double calculateDistanceOfAnotherPoint(Point point)
    {
        return (Math.sqrt(Math.pow((point.getX() - x), 2) + Math.pow((point.getY() - y), 2)));
    }

    public Point movePoint(int x, int y)
    {
        
    }
}
