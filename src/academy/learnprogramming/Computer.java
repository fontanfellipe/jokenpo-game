package academy.learnprogramming;
import java.util.Random;

public class Computer extends Players {
    private Random randomInt;
    private int computerWins;

    public Computer(){
        super();
        randomInt = new Random();
    }

    public int getComputerInput(){
        int maxRange = 3;
        int minRange = 1;
        int randomInt = (int)(Math.random() * (maxRange - minRange + 1) + minRange);
        return randomInt;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public void setComputerWins(int computerWins) {
        this.computerWins = computerWins;
    }
}
