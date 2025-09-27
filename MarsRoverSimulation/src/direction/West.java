package direction;

import rover.Rover;

public class West implements Direction {
    @Override
    public void move(Rover rover) {
        rover.setX(rover.getX() - 1);
    }
    @Override
    public Direction turnLeft() {
        return new South();
    }
    @Override
    public Direction turnRight() {
        return new North();
    }
}
