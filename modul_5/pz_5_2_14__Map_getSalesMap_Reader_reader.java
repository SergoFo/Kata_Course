import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pz_5_2_14__Map_getSalesMap_Reader_reader {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long>  r = new HashMap<>();
        Scanner s = new Scanner(reader);
        while (s.hasNext()) {
            String K = s.next();
            long V = s.nextLong();
            r.merge(K, V, Long::sum);
        }
        return r;
    }
}