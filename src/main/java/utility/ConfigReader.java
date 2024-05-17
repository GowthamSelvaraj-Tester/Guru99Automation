package utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader
	{
		public static final String configFilePath = GlobalVariable.basepath+"//config.properties";
		
		public static String getProperty(String configKey)
		{
			Properties prop = new Properties();
			InputStream input = null;
			String configValue = null;
			
			try
				{
					input = new FileInputStream(configFilePath);
					prop.load(input);
					configValue = prop.getProperty(configKey);
				}
			catch(Exception e)
				{
					e.printStackTrace();
				}
			finally
				{
					try
						{
							input.close();
						}
					catch(Exception e)
						{
							e.printStackTrace();
						}
				}
			
			
			return configValue;
			
		}
	}
