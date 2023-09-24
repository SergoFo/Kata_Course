public class parseAndSqrt_1_6_10 {
    public long parseAndSqrt(String number) {

        //Преобразуем Строку в тип данных double
        double numb = Double.parseDouble(number);

        //Вычисляем квадратный корень
        double numbSqrt = Math.sqrt(numb);

        //Округляем до long
        long numbRound = Math.round(numbSqrt);

        System.out.println(numbRound);

        return numbRound;

/*        //В одну строчку
        return Math.round(Math.sqrt(Double.parseDouble(number)));*/

    }
}
