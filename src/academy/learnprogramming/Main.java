package academy.learnprogramming;


public class Main {

    public static void main(String[] args) {
	// write your code here
        GameBeginning gameBeginning = new GameBeginning();
        GameMechanics gameMechanics = new GameMechanics();
        Player player = new Player();
        Computer computer = new Computer();

        int qntdeDeRodadas = player.getQntdeDeRodadas();

        int count = 0;
        while(count < qntdeDeRodadas){
            int playerInput = player.getPlayerInput();
            int computerInput = computer.getComputerInput();

            gameMechanics.gameResumo(playerInput, computerInput);

            gameMechanics.winCheck(playerInput, computerInput);

            gameMechanics.placarGeral();
            count++;
        }


    }
}
