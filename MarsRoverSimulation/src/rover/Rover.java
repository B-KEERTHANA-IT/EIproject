package rover;

import direction.Direction;
import grid.Grid;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private final Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x;
        int newY = y;
        direction.move(this);
        if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
            x = newX;
            y = newY;
        } else {
            System.out.println("Obstacle detected! Cannot move to (" + newX + ", " + newY + ").");
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void reportStatus() {
        String facing = direction.getClass().getSimpleName();
        System.out.println("Rover is at (" + x + ", " + y + ") facing " + facing + ". No Obstacles detected.");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
