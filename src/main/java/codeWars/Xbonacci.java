package codeWars;

import java.util.Arrays;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        double[] result = initResult(s, n);
        for (int i = s.length; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result;
    }
    private static double[] initResult(double[] s, int n) {
        double[] result = new double[n];
        for (int i = 0; i < s.length && i < n; i++) {
            result[i] = s[i];
        }
        return result;
    }
}

