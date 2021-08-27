import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI extends JFrame {
    Random rand = new Random();
    public int counter = 0;
    public int randomNumber;

    public GUI(){
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(300, 200);
        //panel.setLayout(new CardLayout());

        JLabel label = new JLabel("Guess the number");
        panel.add(label);

        /*
        JTextArea textBox = new JTextArea("This is the text box");
        panel.add(textBox);
         */

        JTextField box = new JTextField("This is the box");
        panel.add(box);

        JButton guessButton = new JButton("Guess");
        panel.add(guessButton);

        JButton closeButton = new JButton("Close");
        panel.add(closeButton);

        JLabel counterLabel = new JLabel();
        counterLabel.setText("Number of guesses so far..." + counter);
        panel.add(counterLabel);

        JButton newGameButton = new JButton("New Game");
        panel.add(newGameButton);

       // closeButton.addActionListener();

        add(panel);
        setVisible(true);
    }
}
