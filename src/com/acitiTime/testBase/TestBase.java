package com.acitiTime.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties Repository = new Properties();
	
	public File f;
	public FileInputStream FI;
	
	public void init() throws IOException{
		
		loadPropertiesFile();
		
	}
	public void loadPropertiesFile() throws IOException{
		f = new File(System.getProperty("user.dir")+"\\src\\com\\acitiTime\\config\\config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);

		f = new File(System.getProperty("user.dir")+"\\src\\com\\acitiTime\\pagelocators\\loginpage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\com\\acitiTime\\pagelocators\\reportspage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\com\\acitiTime\\pagelocators\\taskpage.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
		
		f = new File(System.getProperty("user.dir")+"\\src\\com\\acitiTime\\pagelocators\\timetracks.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
