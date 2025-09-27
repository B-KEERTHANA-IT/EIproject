import commands.*;
import direction.*;
import grid.Grid;
import rover.Rover;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Create a grid of size 10x10
        Grid grid = new Grid(10, 10);

        // Adding obstacles
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        // Initialize the Rover at (0, 0) facing North
        Rover rover = new Rover(0, 0, new North(), grid);

        // Commands to execute
        Commands[] commands = {
            new MoveCommand(), // Move to (0, 1)
            new MoveCommand(), // Move to (0, 2)
            new TurnRightCommand(), // Turn to East
            new MoveCommand(), // Move to (1, 2)
            new TurnLeftCommand(), // Turn to North
            new MoveCommand() // Move to (1, 3)
        };

        for(Commands command : commands) {
            command.execute(rover);
        }

        // Final status report
        rover.reportStatus(); // Output: Rover is at (1, 3) facing North. No Obstacles detected.
    }
}