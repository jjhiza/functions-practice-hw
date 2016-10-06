package com.elysium;

public class Main {

    public static void main(String[] args) {

    }

    /** #1 - Sleeping in */

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation){
            return true;
        }

        return false;

    }

    //monkeyTrouble

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile || !aSmile && !bSmile == true){
            return true;
        }
        return false;
    }

    /** #2 - sumDouble */

    public int sumDouble(int a, int b) {

        int sum = a + b;

        if (a == b){
            sum = sum * 2;

        }
        return sum;
    }

    // diff21

    public int diff21(int n) {

        if (n <= 21){
            return 21 - n;

        }else{
            return (n - 21) * 2;
        }

    }

    // Talking parrot

    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));
    }

    // makes10

    public boolean makes10(int a, int b) {

        return ((a == 10 || b == 10) || (a + b == 10));

    }

    // nearHundred

    public boolean nearHundred(int n) {

        return ((Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10));
    }

    // posNeg - I had some trouble with this one. I was/am unsure why the values (-a and -b cannot be used instead of the
    // </> symbols.

    public boolean posNeg(int a, int b, boolean negative) {

        if (negative){
            return (a < 0 && b < 0);
        }
        else{
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    // THIS WAS A BONUS QUESTION - notString - I had serious problems here, as I'm unsure where the str.length
    // and str.substring calls are
    //coming from.

    public String notString(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

    /** #3 - close10 */

    public int close10(int a, int b) {

        int aValue = Math.abs(10 - a);
        int bValue = Math.abs(10 - b);

        if (aValue == bValue){
            return 0;

        }if (aValue < bValue){
            return a;

        }else{
            return b;
        }
    }



}
