package Log4j_Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	public static Logger log;

	public static void info(String message) {
		log = Logger.getLogger("Log");
		PropertyConfigurator.configure("Log4j.properties");
		log.info(message);
	}

}
