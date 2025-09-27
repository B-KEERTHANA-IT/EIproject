package direction;

import rover.Rover;

public class North implements Direction {
    @Override
    public void move(Rover rover) {
        rover.setY(rover.getY() + 1);
    }
    @Override
    public Direction turnLeft() {
        return new West();
    }
    @Override
    public Direction turnRight() {
        return new East();
    }
}
