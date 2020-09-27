package academy.learnprogramming;

public class GameMechanics extends GameItens {

    Player player = new Player();
    Computer computer = new Computer();

    boolean playing = true;
    int roundCount = 0;

    public void gameResumo(int playerInput, int computerInput){
        System.out.println("#### Você escolheu: " + player.getChoices(playerInput) + " #####");
        System.out.println("#### O computador escolheu: " + player.getChoices(computerInput) + " #####");
    }

    public void winCheck(int playerInput, int computerInput){
        if(playerInput == computerInput)
            System.out.println("Foi um " + result.EMPATE);
        else if (playerInput == 1 && computerInput == 2){
            System.out.println("Você: " + result.GANHOU);
            player.setPlayerWins(player.getPlayerWins() + 1);
        }
        else if(playerInput == 2 && computerInput == 3){
            System.out.println("Você: " + result.GANHOU);
            player.setPlayerWins(player.getPlayerWins() + 1);
        }
        else if(playerInput == 3 && computerInput == 1){
            System.out.println("Você: " + result.GANHOU);
            player.setPlayerWins(player.getPlayerWins() + 1);
        }
        else {
            System.out.println("Você: " + result.PERDEU);
            computer.setComputerWins(computer.getComputerWins() + 1);
        }
    }

    public void placarGeral(){
        System.out.println("### PLACAR ###");
        System.out.println("Jogador 01: " + player.getPlayerWins());
        System.out.println("Computador: " + computer.getComputerWins());
    }
}
