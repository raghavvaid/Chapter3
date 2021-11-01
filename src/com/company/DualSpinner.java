package com.company;

public class DualSpinner {

    public int spin(int min, int max) {
        int rangeMin = min;
        int rangeMax = max;
        int result = (int) ((Math.random() * (rangeMax - rangeMin + 1)) + rangeMin);
        return result;
    }


    public void playRound() {
        int player = this.spin(1,10);
        int computer = this.spin(2,8);
        System.out.println(player);
        System.out.println(computer);
        int p1= player+spin(1,10);
        int c1= computer+spin(2,8);

        if (player == computer){
            if (p1>c1){
                System.out.println(p1-player);
                System.out.println(c1-computer);
                System.out.println("You win! 1 points.");
            }

            else if (player+spin(1,10) == computer+spin(2,8)){
                System.out.println(p1-player);
                System.out.println(c1-computer);
                System.out.println("Tie. 0 points.");
            }

            else {
                System.out.println(p1-player);
                System.out.println(c1-computer);
                System.out.println("You lose! -1 point.");
            }
        }

        else if (player > computer){
            System.out.println("You win! "+(player-computer)+" points.");
        }
        else {
            System.out.println("You lose! "+(player-computer)+" points.");
        }
    }

    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }
    }
}
