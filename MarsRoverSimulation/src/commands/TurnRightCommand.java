package commands;

import rover.Rover;

public class TurnRightCommand implements Commands {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
