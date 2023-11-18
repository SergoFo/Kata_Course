import java.io.*;

public class pz_4_2_6__void_print {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (inputStream.available() > 0) {
            int d = inputStream.read();
            byte data = (byte) d;
            if (data % 2 == 0) {
                outputStream.write(data);
                System.out.println(data);
            }
        }
        outputStream.flush();
    }

    public static void main(String[] args) {
        byte[] input = new byte[]{3, 10, 4, 5, 7};
        InputStream inputStream = new ByteArrayInputStream(input);
        OutputStream outputStream = new ByteArrayOutputStream();
        try {
            print(inputStream, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
