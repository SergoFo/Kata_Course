import java.util.logging.Level;
import java.util.logging.Logger;

public class pz_4_4_8__logging {
    public static class LoggingDemo {
        public static void main(String[] args) {
            Logger logger = Logger.getLogger("com.javamentor.logging.Test");
            logger.info("Все хорошо");
            logger.warning("Произошла ошибка");
        }
    }
}
