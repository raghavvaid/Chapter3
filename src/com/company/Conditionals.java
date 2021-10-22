package com.company;

public class Conditionals {
    public static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        }
        if (aSmile == false && bSmile == false) {
            return true;
        } else return false;
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
    }

    public static boolean negPos(int x, int y, boolean negative){

        if (negative == true) {
            if (x < 0 && y < 0) {
                return true;
            } else return false;
        }

        else {
            if ((x>0 && y>0) || (x<0 && y<0)){
                return false;
            }
            else return true;
        }
    }
}

