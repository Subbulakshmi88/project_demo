package com.logger_concepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	
	 static Logger log = Logger.getLogger(Basic_Configuration.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("info");
		log.warn("warn");
	log.error("error");
	log.fatal("fatal");
	}
}
