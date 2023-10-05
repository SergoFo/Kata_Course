import java.math.*;
import java.util.Arrays;

public class Robot_code {
    public static void main(String[] args) {
        Robot robot = new Robot(30, 10, Direction.DOWN);
        moveRobot(robot, 5, -15);
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
        int stepX = Math.abs(toX - robot.x);
        int stepY = Math.abs(toY - robot.y);
        System.out.println("Количество шагов: x = " + stepX + "," + " y = " + stepY);
        System.out.println("Точка назначения: toX = " + toX + " и toY = " + toY);
        System.out.println("Точка старта: x = " + robot.getX() + " и y = " + robot.getY());

        // Разворачиваем взгляд робот наверх UP (по Y)
        System.out.println();
        while (Direction.UP != robot.dir) {
            robot.turnLeft();
        }
        System.out.println("Я смотрю наверх: " + robot.dir);


        if (robot.getY() < toY) {
            for (int i = 0; i < stepY; i++ ) {
                robot.stepForward();
            }
            System.out.println("Я пришел в точку: toY = " + robot.getY());
        } else {
            robot.turnRight();
            robot.turnRight();
            for (int i = 0; i < stepY; i++) {
                robot.stepForward();
            }
            System.out.println("Я смотрю вниз: " + robot.dir);
            System.out.println("Я пришел в точку: toY = " + robot.getY());
        }
        System.out.println();





        // Разворачиваем взгляд робот направо RIGHT (по X)
        while (Direction.RIGHT != robot.dir) {
            robot.turnLeft();
        }
        System.out.println("Я смотрю направо: " + robot.dir);


        if (robot.getX() < toX) {
            for (int i = 0; i < stepX; i++ ) {
                robot.stepForward();
            }
            System.out.println("Я пришел в точку: toX = " + robot.getX());
        } else {
            robot.turnRight();
            robot.turnRight();
            for (int i = 0; i < stepX; i++) {
                robot.stepForward();
            }
            System.out.println("Я смотрю налево: " + robot.dir);
            System.out.println("Я пришел в точку: toX = " + robot.getX());
        }

        // your code
    }
}
