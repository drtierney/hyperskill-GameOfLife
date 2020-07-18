package life;

import javax.swing.*;

public class GameOfLife extends JFrame {
    JLabel GenerationLabel;
    JLabel AliveLabel;
    Grid grid;
    int currentGeneration = 0;

    public GameOfLife() {
        super("Game of Life");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        GenerationLabel = new JLabel();
        GenerationLabel.setName("GenerationLabel");
        GenerationLabel.setText("Generation #" + getCurrentGeneration());


        AliveLabel = new JLabel();
        AliveLabel.setName("AliveLabel");
        AliveLabel.setText("Alive: 0");

        add(GenerationLabel);
        add(AliveLabel);

        grid = new Grid();
        add(grid);

        setVisible(true);
    }

    public int getCurrentGeneration() {
        return currentGeneration;
    }

    public void nextGeneration() {
        this.currentGeneration++;
    }

}