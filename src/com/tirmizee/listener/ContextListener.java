package com.tirmizee.listener;
import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.PropertyConfigurator;


@WebListener
public class ContextListener implements ServletContextListener {
	
    public ContextListener() {
    }

    public void contextDestroyed(ServletContextEvent event)  { 
    
    }

    public void contextInitialized(ServletContextEvent event)  { 
    	// initialize log4j here
        ServletContext context = event.getServletContext();
        String log4jConfigFile = context.getInitParameter("log4j-config-location"),
        	   fullPath = context.getRealPath("") + File.separator + log4jConfigFile;
        PropertyConfigurator.configure(fullPath);
    }
	
}
