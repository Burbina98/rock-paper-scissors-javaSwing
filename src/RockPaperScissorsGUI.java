import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsGUI extends JFrame {

    //Globally initializing Variables and JFrame components
    ImageIcon icon = new ImageIcon("icon.png");
    static JButton rockBtn = new JButton("ROCK");
    static JButton paperBtn = new JButton("PAPER");
    static JButton scissorsBtn = new JButton("SCISSORS");
    JLabel heading1 = new JLabel("ROCK PAPER SCISSORS");
    static JLabel compScore = new JLabel("Computer Score: " + RockPaperScissors.compScore);
    static JLabel playerScore = new JLabel("Player Score: " + RockPaperScissors.playerScore);
    JLabel subText = new JLabel("Select a button to initiate game");
    static JLabel playerPick = new JLabel();
    static JLabel compPick = new JLabel();
    static JLabel winnerMsg = new JLabel();

    //Lays out the JFrame along with its components.
    public RockPaperScissorsGUI(){

        //Placing the main heading and defining its dimensions
        heading1.setBounds(70, 10,500,50);
        this.add(heading1);
        heading1.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));   //Assigning a font and font size.

        //Placing two labels that will keep track of the player and computer score and increment when appropriate.
        playerScore.setBounds(50, 50, 200, 50);
        compScore.setBounds(350, 50, 200, 50);
        this.add(compScore);
        this.add(playerScore);

        //Pop up message that will update after each round displaying the player picks for that round.
        playerPick.setBounds(125, 100, 500, 50);
        playerPick.setFont(new Font("san serif", Font.BOLD, 25));
        playerPick.setForeground(new Color(0x7eafff));
        playerPick.setVisible(false);
        this.add(playerPick);
        compPick.setBounds(125, 150, 500, 50);
        compPick.setFont(new Font("san serif", Font.BOLD, 25));
        compPick.setForeground(new Color(0xe15959));
        compPick.setVisible(false);
        this.add(compPick);

        //A pop-up message that becomes visible after a winner has been determined.
        //displays the winner of that round.
        winnerMsg.setBounds(125, 200, 500, 50);
        winnerMsg.setFont(new Font("san serif", Font.BOLD, 25));
        winnerMsg.setVisible(false);
        this.add(winnerMsg);

        //Placing the buttons and defining their dimensions.
        rockBtn.setBounds(50, 350, 100, 50);
        this.add(rockBtn);
        rockBtn.setFocusable(false);
        paperBtn.setBounds(200, 350, 100, 50);
        this.add(paperBtn);
        paperBtn.setFocusable(false);
        scissorsBtn.setBounds(350, 350, 100, 50);
        this.add(scissorsBtn);
        scissorsBtn.setFocusable(false);


        subText.setBounds(100, 400, 300, 50);
        this.add(subText);
        subText.setFont(new Font("agency fb", Font.PLAIN, 30));




        //Creates JFrame and sets dimensions.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.getContentPane().setBackground(new Color(0xffe88e));
        this.setLayout(null);
        this.setTitle("Rock Paper Scissors");
        this.setVisible(true);
        this.setIconImage(icon.getImage());

    }
}
