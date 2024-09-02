package simpleProject;

import java.io.FileInputStream;

import java.util.Properties;

public class Simpleprj {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F:\\SELENIUM\\A3CommonData.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
String URL=	pobj.getProperty("url");
String uname=pobj.getProperty("username");
String pass=pobj.getProperty("password");
System.out.println(URL);
System.out.println(uname);
System.out.println(pass);
}
}
