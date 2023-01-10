package Hong.GetterNSetter;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        //거리 계산
        double dist = Point.distance(p1, p2);
        //   System.out.printf("두점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
    }
}


class Point {

    static double distance(Point p, Point q) {
        // double dX = p.x - q.x; //x좌표의 변화량
        //  double dY = p.y - q.y;
        return 0;
        // return Math.sqrt((dX * dX) + (dY * dY));//x좌표의 변화량
    }
}