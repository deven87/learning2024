import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog {


    public static Logger logger = LogManager.getLogger("kjhg");


    public static void printLogInfo(String text) {

        logger.info(text);

    }

}
