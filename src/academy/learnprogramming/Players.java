package academy.learnprogramming;
import java.util.Random;

public class Players extends GameItens {

    public choices getChoices(int playerChoice){
        switch (playerChoice){
            case 1:
                return choices.PAPEL;
            case 2:
                return choices.PEDRA;
            //case 3:
        }
            return choices.TESOURA;
    }
}
