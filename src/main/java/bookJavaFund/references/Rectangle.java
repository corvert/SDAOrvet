package bookJavaFund.references;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle r1, r2;

        r1 = new Rectangle(100, 200);
        r2 = r1;

        r1.height = 300;
        r1.width = 400;
        System.out.println("r1 width = " + r1.width + ", height = " + r1.height);
        System.out.println("r2 width = " + r2.width + ", height = " + r2.height);
    }
}
