public class printOddNumbers_1_5_12 {
    public static void printOddNumbers(int[] arr) {

        // Считаем количество элементов
        int elementsCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                elementsCount++;
            }
        }
        System.out.println(elementsCount);                // Проверка количества элементов

        //Индекс для вставки
        int indexToInsert = 0;

        //Создаем новый массив с нечетным количеством элементов
        int[] odd = new int[elementsCount];

        //Вставляем
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd[indexToInsert] = arr[i];
                if (indexToInsert + 1 < elementsCount) {
                    System.out.print(odd[indexToInsert] + ",");
                } else {
                    System.out.println(odd[indexToInsert] + "");
                }
                indexToInsert++;
            }
        }
    }
}
