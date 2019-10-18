package com.demo.resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Base {
	public static WebDriver driver;
	public static WebDriver getBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberProject\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
	}
	
	public static void loadUrl(String Url) {
		driver.get(Url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static WebElement findElementById(String Value) {
		WebElement txt = driver.findElement(By.id(Value));
		return txt;
	}
	
	public static void setText(WebElement element, String value) {
		   element.sendKeys(value);	 
	}
	
	public static void setKeys(WebElement element, Keys value) {
		   element.sendKeys(value);	 
	}
	
	public static String readUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public static String readText(WebElement element) {
		String value = element.getText();
		System.out.println(value);
		return value;
	}
	private static boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static String getAttribute(WebElement element) {
		String value = null;
		if(elementFound(element)) {
		value = element.getAttribute("value");
		System.out.println(value);
	}
		return value;
	}
	public static void selectByValue (WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static WebElement findElementByPath(String path) {
		WebElement x = driver.findElement(By.xpath(path));
		return x;
	}
	public static void btnClick(WebElement element) {
			element.click();
	}
	public static void quitBrowser() {
			driver.quit();
	}
	public static List<HashMap<String,String>> readValuefromExcelSheet(){
		List<HashMap<String,String>>mapDatasList = new ArrayList<HashMap<String,String>>();
		try {
			File excelLocation = new File("C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\ExcelDatas\\UserDetails.xlsx");
			String sheetName="Sheet1";
			FileInputStream f = new FileInputStream(excelLocation);
			Workbook w = new XSSFWorkbook(f);
			Sheet sheet = w.getSheet(sheetName);
			Row headerRow = sheet.getRow(0);
			for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String,String>mapDatas = new HashMap<String,String>();
				for(int j=0;j<headerRow.getPhysicalNumberOfCells();j++) {
					Cell currentCell = currentRow.getCell(j);
					switch(currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					
					case Cell.CELL_TYPE_NUMERIC:
						double n = currentCell.getNumericCellValue();
						long l = (long) n;
						mapDatas.put(headerRow.getCell(j).getStringCellValue(), String.valueOf(l));
						break;
					}
				}
				mapDatasList.add(mapDatas);
			}
		}catch(Throwable e) {
			e.printStackTrace();
			}
			return mapDatasList;
		}
}
