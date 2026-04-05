package Com.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Demo { 

	public static void main(String[] args) {
		Logger log=LogManager.getFormatterLogger();
		log.info("This is an log massage");
		log.info("This is an log massage");
		log.info("This is an log massage");
		log.info("This is an error massage");

	}

}
