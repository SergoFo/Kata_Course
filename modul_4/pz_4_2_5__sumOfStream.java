import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class pz_4_2_5__sumOfStream {
    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() > 0) {                           // read на выходе int, available количество непрочитанных байтов
            int b = inputStream.read();
            byte c = (byte) b;                                          // преобразование обратно в byte
            sum = sum + c;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 4, 10};
        InputStream inputStream = new ByteArrayInputStream(input);
        int result = sumOfStream(inputStream);
        System.out.println(result);

    }
}
