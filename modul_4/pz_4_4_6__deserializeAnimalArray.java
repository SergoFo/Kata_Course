import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class pz_4_4_6__deserializeAnimalArray {
    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {

        try (
                ByteArrayInputStream input = new ByteArrayInputStream(data);
                ObjectInputStream ois = new ObjectInputStream(input)) {

            int animalCount = ois.readInt(); //читаем из потока кол-во объектов в классе
            Animal[] animals = new Animal[animalCount]; //создаем массив объектов

            for (int i = 0; i < animalCount; i++) {
                animals[i] = (Animal) ois.readObject(); //заполняем массив объектами
            }

            return animals; //возвращаем массив объектов

        } catch (Exception e) { //ловим и бросаем исключения
            throw new IllegalArgumentException(e);
        }
    }


    public static void main(String[] args) throws IOException {

        //создание экземпляра класса с объектами
        Animal[] intermediate = {new Animal("Dog"), new Animal("Cat"), new Animal("Mouse")};
        try (
                //открываем поток вывода данных
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

        //записываем в поток количество объектов в классе
            oos.writeInt(intermediate.length);

            //Записываем объекты в поток вывода
            for (Animal animal : intermediate) {
                oos.writeObject(animal);
            }

            // Метод flush () используется, чтобы принудительно записать в целевой поток данные, которые могут кэшироваться в текущем потоке.
            output.flush();

            System.out.println(Arrays.toString(intermediate));
            //восстанавливаем из потока объекты класса
            byte[] bArray = output.toByteArray();
            Animal[] animal = deserializeAnimalArray(bArray);
            System.out.println(Arrays.toString(animal));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


