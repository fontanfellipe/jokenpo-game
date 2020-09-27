package academy.learnprogramming;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Player extends Players {

    Scanner input;
    private int playerWins = 0;

    public Player(){
        super();
        input = new Scanner(System.in);
    }

    public int getQntdeDeRodadas(){
        System.out.println("Vamos jogar pedra, papel e tesoura:");
        System.out.println("Digite quantas rodadas você gostaria de jogar: 3, 5, 7 (Digite somente o numero e pressione enter)");
        int qntDeRodadas = input.nextInt();
        if (qntDeRodadas != 3 && qntDeRodadas !=5 && qntDeRodadas != 7){
            getQntdeDeRodadas();
        }
        return qntDeRodadas;
    }
    public int getPlayerInput(){
        System.out.println("Faça a sua escolha:\n - 1- Papel \n - 2 - Pedra \n - 3 - Tesoura \n (Digite somente o numero e pressione enter)");
        int playerInput = input.nextInt();
        if (playerInput != 1 && playerInput !=2 && playerInput != 3){
            getPlayerInput();
        }
        return playerInput;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}
