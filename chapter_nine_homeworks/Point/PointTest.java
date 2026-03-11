package Point;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point();
        a.setX(3);
        a.setY(4);
        System.out.println("Point A: " + a.getX() + " " + a.getY());

        Point b = new Point();
        b.setX(-8);
        b.setY(0);
        System.out.println("Point B: " + b.getX() + " " + b.getY());

        double distanceOfOrigin = a.calculateDistanceOfOrigin();
        System.out.println("Distance of origin from point A: " + distanceOfOrigin);

        a.movePoint(3, -4);
        System.out.println("Point A: " + a.getX() + " " + a.getY());

        distanceOfOrigin = a.calculateDistanceOfOrigin();
        System.out.println("Distance of origin from point A: " + distanceOfOrigin);

        double distanceOfAnotherPoint = a.calculateDistanceOfAnotherPoint(b);
        System.out.println("Distance of point B from point A: " + distanceOfAnotherPoint);

        Point c = new Point();
        c = a.clonePoint();
        System.out.println("Clone point is C point: " + c.getX() + " " + c.getY());


    }
}
