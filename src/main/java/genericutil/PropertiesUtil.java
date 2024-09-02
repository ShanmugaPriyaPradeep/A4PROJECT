package genericutil;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertiesUtil {
public String getDataForGeneric(String data) throws Exception {
	//FileInputStream fis=new FileInputStream("F:\\SELENIUM\\A3CommonData.properties");
	FileInputStream fis=new FileInputStream(Iconstantutil.propertyPath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String Data=pobj.getProperty(data);
	return Data;
	
}
}
