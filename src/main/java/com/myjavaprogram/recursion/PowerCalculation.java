package com.myjavaprogram.recursion;
// x to the power n calculation

public class PowerCalculation {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xPowerNum1 = calcPower(x, n - 1);
        int xPowerNum = x * xPowerNum1;
        return xPowerNum;

    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.print(ans);

    }

}
