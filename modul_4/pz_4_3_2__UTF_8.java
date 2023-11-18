import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class pz_4_3_2__UTF_8 {
    public static void main(String[] args) throws IOException {
        InputStream bS = new ByteArrayInputStream("Ы".getBytes());
        int b = 0;
        while ((b = bS.read()) != -1)
            System.out.print(b  + " ");
    }
}
