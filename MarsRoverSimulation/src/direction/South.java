package direction;

import rover.Rover;

public class South implements Direction {
    @Override
    public void move(Rover rover) {
        rover.setY(rover.getY() - 1);
    }
    @Override
    public Direction turnLeft() {
        return new East();
    }
    @Override
    public Direction turnRight() {
        return new West();
    }
}
