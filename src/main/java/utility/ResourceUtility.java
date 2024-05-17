package utility;

public class ResourceUtility 
	{
		public static String getFolderPath()
		{
			return GlobalVariable.basepath+ConfigReader.getProperty("testDataPath");
		}
	}
