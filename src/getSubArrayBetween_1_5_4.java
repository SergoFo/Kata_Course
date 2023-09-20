public class getSubArrayBetween_1_5_4 {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {

//Сколько у нас будет элементов (Чтобы создать массив)
        int elementsCount = 0;

//Считаем элементы - тупое решение
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                elementsCount++;
            }
        }
        System.out.println(elementsCount);

//Индекс для вставки, точка отсчета
        int indexToInsert = 0;

//Фикс массива
        int[] result = new int[elementsCount];       //Подмассив с количеством элементов elementsCount

//Вставляем
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[indexToInsert] = numbers[i];
                if (indexToInsert + 1 < elementsCount) {
                    System.out.print(result[indexToInsert] + ", ");
                } else {
                    System.out.println(result[indexToInsert] + "]");
                }
                indexToInsert++;
            }
        }
        return result;
    }
}

