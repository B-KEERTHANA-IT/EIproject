package commands;

import rover.Rover;

public class TurnLeftCommand implements Commands {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
