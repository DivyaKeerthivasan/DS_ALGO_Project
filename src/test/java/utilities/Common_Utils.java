package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.TakesScreenshot;
import constants.Constants;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Common_Utils {
	
	private static Common_Utils Common_UtilsInstance= null;
	public static List<String> questionsList=new ArrayList<String>();
	//Config file loader
	public void loadProperties() {

		Properties properties=null;
		try {
			System.out.println("Inside try");
			if(properties==null) {
				properties = new Properties();
				System.out.println("properties object created");
				properties.load(getClass().getResourceAsStream("/config.properties"));
				System.out.println("after load");
				Constants.URL=properties.getProperty("GET_STARTED_URL");
				
				Constants.BROWSER=	properties.getProperty("BROWSER");
				Constants.HOMEPAGE=	properties.getProperty("HOMEPAGE_URL");
				Constants.LOGINPAGE= properties.getProperty("LOGINPAGE_URL");
				Constants.USERNAME= properties.getProperty("USERNAME");
				Constants.PASSWORD= properties.getProperty("PASSWORD");
				Constants.ARRAYPAGE= properties.getProperty("ARRAYPAGE_URL");
				Constants.ARRAYSINPYTHON= properties.getProperty("ARRAYSINPYTHON_URL");
				Constants.EDITORBOX= properties.getProperty("EDITOR_URL");
				Constants.ARRAYSUSINGLIST= properties.getProperty("ARRAYSUSINGLIST_URL");
				Constants.APPLICATIONSOFARRAY= properties.getProperty("APPLICATIONSOFARRAY_URL");
				Constants.PRACTICEQUESTIONS= properties.getProperty("PRACTICEQUESTION_URL");
				Constants.TREEPAGE =properties.getProperty("TREEPAGE_URL");
				
				Constants.BASICOPERATIONSINLISTS= properties.getProperty("BASICOPERATIONSINLISTS_URL");
				Constants.APPLICATIONSOFARRAY= properties.getProperty("APPLICATIONSOFARRAY_URL");
				Constants.PRACTICEQUESTIONS= properties.getProperty("PRACTICEQUESTION_URL");
				Constants.PRACTICEQUESTION1= properties.getProperty("PRACTICEQUESTION1_URL");
				Constants.PRACTICEQUESTION2= properties.getProperty("PRACTICEQUESTION2_URL");
				Constants.PRACTICEQUESTION3= properties.getProperty("PRACTICEQUESTION3_URL");
				Constants.PRACTICEQUESTION4= properties.getProperty("PRACTICEQUESTION4_URL");
				
			
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		
		
		
		

	}
public static void readExcelFile(String file) throws InvalidFormatException, IOException {

		

        //Excel file location
		File excelFile= new File(file);
		//creating obj for the workbook		
		XSSFWorkbook workbook= new XSSFWorkbook(excelFile);

		//getting the sheet from the workbook with the index position
		XSSFSheet sheet=workbook.getSheetAt(0);
		//to iterate the rows
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				String value =cellIterator.next().getStringCellValue();
				questionsList.add(value);
			}

		}
}
}


	//public void takeScreenshot() {
	  
	//	File screenshot = ((TakesScreenshot)
    //    DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

//Copy the file to a location and use try catch block to handle exception 
	//	try
	//	{ 
	 // FileUtils.copyFile(screenshot, new File("C:\\Users\\arulp\\git\\Cucumber_UI_Framework\\ui_automation_cucumber\\screenshot\\"+Common_Step_Definition.getScenarioName()+".png")); 

//} catch (IOException e) { System.out.println(e.getMessage()); 
//} 
//}

