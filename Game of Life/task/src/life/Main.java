package life;

public class Main {
    public static void main(String[] args) {

        GameOfLife gameOfLife = new GameOfLife();

        Universe universe = new Universe();
        Generation generation = new Generation(universe);
        universe.setCurrentState(generation.generationZero());

        while (true){
            generation.nextGeneration();

            char [][] currentState = universe.getCurrentState();

            for (int i = 0; i < currentState.length; i++) {
                for (int j = 0; j < currentState.length; j++) {
                    if (currentState[i][j] == 'O') {
                        gameOfLife.grid.fillCell(i, j);
                    } else {
                        gameOfLife.grid.removeCell(i, j);
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            String gen = "Generation #" + gameOfLife.getCurrentGeneration();
            String alive = "Alive: " + generation.getAliveCount(currentState);

            gameOfLife.GenerationLabel.setText(gen);
            gameOfLife.AliveLabel.setText(alive);

            gameOfLife.nextGeneration();
        }
    }
}
