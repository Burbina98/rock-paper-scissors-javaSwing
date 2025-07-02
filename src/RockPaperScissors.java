import java.awt.*;
import java.util.Random;

public class RockPaperScissors {

    static boolean running = false;
    static String playerSelect;
    static String compMove;
    static String winner;
    static int compScore = 0;
    static int playerScore = 0;



    public RockPaperScissors(){
        new RockPaperScissorsGUI();
        initializeGame();
    }

    public static void initializeGame(){
        running = true;
        RockPaperScissorsGUI.rockBtn.addActionListener(e -> {
            playerSelect ="rock";
            buttonClicked();
        });
        RockPaperScissorsGUI.paperBtn.addActionListener(e -> {
            playerSelect = "paper";
            buttonClicked();
        });
        RockPaperScissorsGUI.scissorsBtn.addActionListener(e -> {
            playerSelect = "scissors";
            buttonClicked();
        });

    }

    public static void buttonClicked(){
        pickCompMove();
        checkWinner();
        displayPicks();
        displayWinner();
        updateScore();

    }



    //Generates a random number between 1 & 3 and assigns "rock", "paper", or "scissors" to compMove.
    public static void pickCompMove(){
        Random random = new Random();
        int compSelect = random.nextInt(3)+1;

        if (compSelect == 1){
            compMove = "rock";
        }else if (compSelect == 2){
            compMove = "paper";
        }else{
            compMove = "scissors";
        }

    }

    public static void displayPicks(){
        RockPaperScissorsGUI.playerPick.setText("You chose " + playerSelect);
        RockPaperScissorsGUI.playerPick.setVisible(true);
        RockPaperScissorsGUI.compPick.setText(("Computer chose " + compMove));
        RockPaperScissorsGUI.compPick.setVisible(true);
    }

    //Checks winning conditions and returns a string of the winner of the round.
    public static String checkWinner(){
        if(playerSelect == compMove){
            winner = "draw";
        }else if (playerSelect == "rock" && compMove == "scissors"){
            winner = "player";
        }else if (playerSelect == "paper" && compMove == "rock"){
            winner = "player";
        }else if (playerSelect == "scissors" && compMove == "paper"){
            winner = "player";
        }else{
            winner = "computer";
        }
        return winner;
    }

    public static void displayWinner(){
        if (winner == "draw"){
            RockPaperScissorsGUI.winnerMsg.setText("This round was a draw!");
            RockPaperScissorsGUI.winnerMsg.setForeground(new Color(0x000000));
            RockPaperScissorsGUI.winnerMsg.setVisible(true);
        }else if (winner == "player"){
            RockPaperScissorsGUI.winnerMsg.setText("You won this round!!");
            RockPaperScissorsGUI.winnerMsg.setForeground(new Color(0x7eafff));
            RockPaperScissorsGUI.winnerMsg.setVisible(true);
        }else{
            RockPaperScissorsGUI.winnerMsg.setText("Computer won this round!!");
            RockPaperScissorsGUI.winnerMsg.setForeground(new Color(0xe15959));
            RockPaperScissorsGUI.winnerMsg.setVisible(true);
        }
    }

    public static void updateScore(){
        if (winner == "player"){
            playerScore += 1;
            RockPaperScissorsGUI.playerScore.setText("Player score: " + playerScore);
        }else if (winner == "computer"){
            compScore += 1;
            RockPaperScissorsGUI.compScore.setText("Computer score: " + compScore);
        }
    }
}
