public class pz_2_1_6__Cat_and_Dog {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat first) {
            System.out.println("Кошка поймана");
            sayHello();
            first.sayHello();
        }
    }
}
