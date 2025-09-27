package grid;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private final int width;
    private final int height;
    private final List<Obstacle> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new ArrayList<>();
    }

    public void addObstacle(int x, int y) {
        if (isWithinBounds(x, y)) {
            obstacles.add(new Obstacle(x, y));
        }
    }

    public boolean isObstacle(int x, int y) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getX() == x && obstacle.getY() == y) {
                return true;
            }
        }
        return false;
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
