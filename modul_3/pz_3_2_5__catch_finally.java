public class pz_3_2_5__catch_finally {
    public static class Car implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
    }

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception ignore) {
        }
    }
}
