// A Rectangle stores an (x, y) coordinate of its top/left corner, a width and height.
public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // constructs a new Rectangle with the given x,y, width, and height
    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    // returns the fields' values
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // returns a string such as {(5,12), 4x8}
    public String toString() {
        return "{(" + x + "," + y + "), " + width + "x" + height + "}";
    }

    public Point getUpLeft() {
        return new Point(x, y);
    }

    public Point getUpRight() {
        return new Point(x + width, y);
    }

    public Point getLowLeft() {
        return new Point(x, y + height);
    }

    public Point getLowRight() {
        return new Point(x + width, y + height);
    }

    public boolean contains(int x, int y) {
        if (x >= this.x && x <= (this.x + width)) {
            if (y >= this.y && y <= (this.y + height)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean contains(Point point) {
        return this.contains(point.getX(), point.getY());
    }

    public boolean overlap(Rectangle rect) {
        if (this.contains(rect.getUpLeft())) {
            return true;
        } else if (this.contains(rect.getUpRight())) {
            return true;
        } else if (this.contains(rect.getLowLeft())) {
            return true;
        } else if (this.contains(rect.getLowRight())) {
            return true;
        } else if (rect.contains(this.getUpLeft())) {
            return true;
        } else if (rect.contains(this.getUpRight())) {
            return true;
        } else if (rect.contains(this.getLowLeft())) {
            return true;
        } else if (rect.contains(this.getLowRight())) {
            return true;
        } else {
            return false;
        }
    }
}