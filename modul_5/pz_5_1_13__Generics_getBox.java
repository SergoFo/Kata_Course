public class pz_5_1_13__Generics_getBox {
    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<T>();
        }
    }
}
