public class cycles {
    public static void main(String[] args) {

/*
        Цикл While

        expression — условие цикла, выражение, которое должно возвращать boolean значение.
        statement(s) — тело цикла (одна или более строк кода).
        Перед каждой итерацией будет вычисляться значение выражения expression.
        Если результатом выражения будет true, выполняется тело цикла — statement(s).
*/

        int countDown = 10;

        while (countDown >= 0) {                             //expression
            System.out.println("До старта: " + countDown);   //statement(s)
            countDown--;
        }
        System.out.println("Поехали !\n");





/*      Цикл for

        initialization — выражение, которое инициализирует выполнение цикла.
                         Исполняется только раз в начале цикла. Чаще всего в этом выражении инициализируют счетчик цикла.
        termination — boolean выражение, которое регулирует окончание выполнения цикла.
                         Если результат выражения будет равен false, цикл for прервется.
        increment — выражение, которое исполняется после каждой итерации цикла.
                         Чаще всего в этом выражении происходит инкрементирование или декрементирование переменной счетчика.
        statement(s) — тело цикла.
*/

        for (int i = 1; i < 6; i++) {              //for (initialization; termination; increment) {
            System.out.println("Строка №" + i);    //statement(s)

        }
        System.out.println();





/*      Цикл for each

        Этот цикл Java — разновидность цикла for для итерации коллекций и массивов.

        vars — переменная, существующий список или массив.
        Type var — определение новой переменной того же типа (Type), что и массив/коллекция vars.
        statement(s) — тело цикла
*/

/*        for (Type var : vars) {
            statement(s)
        }
*/

    }
}
