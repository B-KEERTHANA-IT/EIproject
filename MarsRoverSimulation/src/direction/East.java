package direction;

import rover.Rover;

public class East implements Direction {
    @Override
    public void move(Rover rover) {
        rover.setX(rover.getX() + 1);
    }
    @Override
    public Direction turnLeft() {
        return new North();
    }
    @Override
    public Direction turnRight() {
        return new South();
    }
}
