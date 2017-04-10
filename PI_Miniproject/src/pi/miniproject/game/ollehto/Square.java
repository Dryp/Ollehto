import javax.swing.*;
import java.awt.*;

public class Square {

JFrame frame;
JPanel squares[][] = new JPanel[8][8];

public Square() {
    frame = new JFrame("Ollehto");
    frame.setSize(500, 500);
    frame.setLayout(new GridLayout(8, 8));

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            squares[i][j] = new JPanel();

            if ((i + j) % 2 == 0) {
                squares[i][j].setBackground(Color.green.brighter());
            } else {
                squares[i][j].setBackground(Color.green.darker());
            }   
            frame.add(squares[i][j]);
        }
    }
    //We can do it like this to add a picture of the trick pieces individually to the squares that we want.
    //squares[5][2].add(new JLabel(new ImageIcon("trickpiece1.png")));
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public static void main(String[] args) {
    new Square();
    }
}
