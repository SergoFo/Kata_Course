import java.math.*;
import java.util.Arrays;

public class Robot_code {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public enum Direction {            // Направление взгляда робота через перечесление
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
                                      // Объявляем переменные внутри класса Robot
        int x;                        // Координата x
        int y;                        // Координата y
        Direction dir;                // Направление взгляда

        public Robot(int x, int y, Direction dir) {     // Конструктор с параметрами x,y,dir через this
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {              // Текущее направление взгляда
            return dir;
        }

        public int getX() {                            // Текущая координата х
            return x;
        }

        public int getY() {                            // Текущая координата y
            return y;
        }

        public void turnLeft() {                       // Повернуться на 90 градусов против часовой стрелки
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {                       // Повернуться на 90 градусов по часовой стрелке
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {                     // Шаг в направлении взгляда
            if (dir == Direction.UP) {                  // За один шаг робот изменяет одну свою координату на единицу
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // your code
    }
}
