package com.tirmizee.db.config;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Driver;
/**
 * @author tirmizee
 *
 */
public class DBUtil {

	private static final Logger LOGGER = Logger.getLogger(DBUtil.class);
//	private static Connection con = null;
	private static String url;
	private static String username;
	private static String password;
	
	
	static{
		LOGGER.debug("initial config db");
		Properties properties = new Properties();
		InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream( "config.properties" );
		try{
				properties.load(inputStream);
				url = properties.getProperty( "url" ).trim();       
				username = properties.getProperty( "username" ).trim(); 
				password = properties.getProperty( "password" ).trim();  
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		LOGGER.debug("new connection db");
		Connection con = null;
		try{
			Class.forName(Driver.class.getName());
			con = DriverManager.getConnection( url,username,password );	
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection( Connection closeCon ) {
		try{
			 if(closeCon != null ){
				 closeCon.close();
			 }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
}
