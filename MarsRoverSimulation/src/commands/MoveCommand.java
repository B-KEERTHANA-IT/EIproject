package commands;
import rover.Rover;
public class MoveCommand implements Commands {
    @Override
    public void execute(Rover rover) {
        rover.move();
    }
}