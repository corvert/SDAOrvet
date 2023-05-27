package codeWars;

public class BouncingBall {
    public static void main(String[] args) {
        System.out.println(bouncingBall(30, 0.66, 1.5));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        do {
            if (h <= 0 || bounce >= 1 || bounce <= 0 || window >= h)
                return -1;
            if (h > window)
                count++;
            h = h * bounce;
            if (h > window)
                count++;
        } while (h > window);

        return count;
    }
}
