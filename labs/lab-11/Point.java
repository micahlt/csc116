public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int px, int py) {
        x = px;
        y = py;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceFromOrigin() {
        double dist = Math.sqrt(x * x + y * y);
        return dist;
    }

    public double distance(Point other) {
        int dx = other.x - x;
        int dy = other.y - y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist;
    }

    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point point) {
        if (this.getX() != point.getX()) {
            return this.getX() - point.getX();
        } else if (this.getY() != point.getY()) {
            return this.getY() - point.getY();
        } else {
            return 0;
        }
    }

    public int quadrant() {
        if (x > 0) {
            if (y > 0)
                return 1;
            else
                return 4;
        } else if (x < 0) {
            if (y > 0)
                return 2;
            else
                return 3;
        } else {
            return 0;
        }
    }

    public void flip() {
        int originalX = x, originalY = y;
        x = originalY * -1;
        y = originalX * -1;
    }
}
