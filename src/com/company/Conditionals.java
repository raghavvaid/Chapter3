package com.company;

public class Conditionals {
    //Chimp Trouble!
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        }
        if (aSmile == false && bSmile == false) {
            return true;
        } else return false;
    }

    //Pick Up Phone
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        } else {
            if ((isMorning == true) && (isMom == true)) {
                return true;
            }
            if ((isMorning == true) && (isMom == false)) {
                return false;
            } else return true;
        }
    }

    //Negative-Positive
    public static boolean negPos( int x, int y, boolean negative){

        if (negative == true) {
            if (x < 0 && y < 0) {
                return true;
            } else return false;
        } else {
            if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
                return false;
            } else return true;
        }
    }

    //Alarm
    public static String setAlarm ( int day, boolean onVacation){
                if (onVacation == true) {
                    if (day < 1 || day > 5) {
                        return "off";
                    } else return "10:00";
                }

                if (day > 0 && day < 6) {
                    return "7:00";
                } else
                    return "10:00";
            }

    //OnesDigitSame
    public static boolean onesDigitSame ( int a, int b, int c){
        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;
        if ((a1 == b1) || (b1 == c1) || (a1 == c1)) {
            return true;
        } else return false;
    }

    //BlackJack
    public static int blackjack ( int x, int y){
        if (x > 21 && y > 21) {
            return 0;
        } else if (y > 21) {
            return x;
        } else if (x > 21) {
            return y;
        } else if (x > y) {
            return x;
        } else {
            return y;
        }
    }


    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false,false));
        System.out.println(chimpTrouble(true, false ));
        System.out.println(chimpTrouble(false, true));
        System.out.println("");
        System.out.println(negPos(1,-1, false));
        System.out.println(negPos(-1,1, false));
        System.out.println(negPos(1,1, false));
        System.out.println(negPos(-1,-1, false));
        System.out.println(negPos(-4,-5, true));
        System.out.println(negPos(-4,5, true));
        System.out.println(negPos(4,5, true));
        System.out.println(negPos(4,-5, true));
        System.out.println(" ");
        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));
        System.out.println(" ");
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));
        System.out.println(" ");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println(" ");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}
