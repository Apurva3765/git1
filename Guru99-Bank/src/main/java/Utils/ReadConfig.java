package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
Properties pro ;

public ReadConfig()
{
	File src = new File("./Configerations/config.properties");
	try
	{
		FileInputStream file = new FileInputStream(src);
		pro = new Properties();
		pro.load(file);
	}
	catch(Exception e)
	{
		System.out.println("Exception is "+e.getMessage());
	}
}

public String getURL() 
{
	String urL = pro.getProperty("url");	
	
return urL;	
}
public String getuserID() 
{
	String userid = pro.getProperty("userID");	
	
return userid;	
}
public String getPassword() 
{
	String passwrd = pro.getProperty("password");	
	
return passwrd;	
}











}
