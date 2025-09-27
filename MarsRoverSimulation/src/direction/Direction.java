package direction;

import rover.Rover;

public interface Direction {
    void move(Rover rover);
    Direction turnLeft();
    Direction turnRight();
}