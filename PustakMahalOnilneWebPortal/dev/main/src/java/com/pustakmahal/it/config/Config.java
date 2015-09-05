package com.pustakmahal.it.config;
/**
 * @author Adrish Bhattacharyay
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Config {
	
	private static final String DRIVER = "driver";
	private static final String CONNECTSTR = "connectstr";
	private static final String DBUSER = "dbuser";
	private static final String DBPASS = "dbpass";
	private static final String filename = "config.properties";
	
	/**
	 * @return
	 */
	public Config getInstance(){
		return new Config();
	}
	
}
