import java.util.Arrays;

public class pz_5_1_15__java_util_Arrays {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);


        System.out.println(array.get(11) + " ");

        System.out.println(array.size());
    }

    /*public static class DynamicArray<T> {
        private T[] values;
        T[] temp = values;

        public DynamicArray() {
            values = (T[]) new Object[0];
        }


        public void add(T el) {
            T[] temp = values;                                                      // temp это указатель старого массива
            values = (T[]) new Object[temp.length + 1];                            // создаем новый массив с колличеством элементов +1
            System.arraycopy(temp, 0, values, 0, temp.length);       // откуда, с какого элемента, куда, с какого элемента, сколько элементов хотим скопировать
            values[values.length - 1] = el;                                        // в пустой конечный индекс добавляем элемент el
        }

        public void remove(int index) {
            T[] temp = values;                                                    // temp это указатель старого массива
            values = (T[]) new Object[temp.length - 1];                            // создаем новый массив с колличеством элементов -1
            System.arraycopy(temp, 0, values, 0, index);              // откуда, с какого элемента, куда, с какого элемента, сколько элементов хотим скопировать
            int amountElemAfterIndex = temp.length - index - 1;                    // Количество элементов после индекса
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);       // откуда, с какого элемента, куда, с какого элемента, сколько элементов хотим скопировать

        }

        public T get(int index) {
            try {
                return values[index];
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
            return values[index];
        }

        public int size() {
            return values.length;
        }
    }*/




    public static class DynamicArray<T> {
        private T[] values = (T[]) new Object[10];
        private int sizeIntLength;

        public DynamicArray() {

        }

        public T get(int index) {
            if (index < 0 && index >= sizeIntLength) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return values[index];
        }

        public void remove(int index) {
            if (index >= sizeIntLength && index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.arraycopy(values, index + 1, values, index, values.length - index - 1);
            sizeIntLength--;
        }

        public void add(T el) {
            if (sizeIntLength == values.length) {
                values = Arrays.copyOf(values, values.length << 1);
            }
            values[sizeIntLength++] = el;
        }
        public int size() {
            return values.length;
        }
    }
}

