import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class pz_4_3_6__readAsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int bufferSize = 1024;
        char[] buffer = new char[bufferSize];
        StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, charset);
        for (int i; (i = in.read(buffer, 0, buffer.length)) > 0; ) {
            out.append(buffer, 0, i);
        }
        return out.toString();
    }

    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[]{48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }
}

