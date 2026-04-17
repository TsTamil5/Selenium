package com.redbus.testing.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllUtililtyFunction {
	WebDriver driver;
	WebDriverWait wait;

	public void configmaximizedbrowser(WebDriver temp) {
		temp.manage().window().maximize();
	}
	public void configminimizedbrowser(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void configfullscreenbrowser(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	public Dimension fetchbrowsersize(WebDriver driver) {
		Dimension dimension=driver.manage().window().getSize();
		return dimension;
	}
	public void configbrowsersize(WebDriver driver,int width,int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	public Point  fetchbrowserposition(WebDriver driver) {
		Point point=driver.manage().window().getPosition();
		return point;
	}
	public void configbrowserposition(WebDriver driver,int x,int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	
	//navigate
	//navigateto
	public void navigateToApplication(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	//forward
	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}
	public void navigateBackward(WebDriver driver) {
		driver.navigate().back();
	}
	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	//get
	public void enterUrl(WebDriver driver,String url) {
		driver.get(url);
	}
	//get title
	public String fetchApplicationTitle(WebDriver driver) {
		String title=driver.getTitle();
		return title;
	}
	//get current url
	public String fetchCurrentApplicationUrl(WebDriver driver) {
		String  currenturl=driver.getCurrentUrl();
		return currenturl;
	}
	//close
	public void closingBrowserTab(WebDriver driver) {
		driver.close();
	}
	//quit
	public void closingBrowserWindow(WebDriver driver) {
		driver.quit();
	}
	
	//timeouts
	//implicit wait
	public void handlingImplicitTimeout(WebDriver temp, long timeInSeconds) {
		temp.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	//expicit wait
	public void waitTillElementIsClickable(WebDriver driver,WebElement element,long maximumTimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitTillTheElementIsVisible(WebDriver driver,WebElement element,long maxTimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	//popups
	public void clickOnAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void clickOnDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void typeMessageInPopup(WebDriver driver,String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String printPopupMessage(WebDriver driver) {
		String msg=driver.switchTo().alert().getText();
		return msg;
	}
	
	//child window switching
	public void switchingToChildWindow(WebDriver driver) {
		String parentid=driver.getWindowHandle();
		Set<String> allids=driver.getWindowHandles();
		allids.remove(parentid);
		for(String childid:allids) {
			driver.navigate().to(childid);
		}
	}
	
	//iframes
		public void switchFrameIndex(WebDriver driver,int index) {
			driver.switchTo().frame(index);
		}
		public void switchFrameByIndexOrname(WebDriver driver,String idOrNumValue) {
			driver.switchTo().frame(idOrNumValue);
		}
		public void switchFrameByFrameElement(WebDriver driver,WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
		public void switchBacktheControltoPreviousPage(WebDriver driver) {
			driver.switchTo().parentFrame();
		}
		public void switchBacktheControltoMainPage(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
		// read
		public String getPropertyKeyValue(String key) throws IOException {
			FileInputStream fs = new FileInputStream("./src/main/resources/data.properties");
			Properties prop = new Properties();
			prop.load(fs);
			String value = prop.getProperty(key);
			return value;
		}

		// write
		public void setPropertyKyeValue(String key, String value) throws IOException {
			FileOutputStream fos = new FileOutputStream("./src/main/java/orangehrm_common_data/commondata.properties");
			Properties prop = new Properties();
			prop.setProperty(key, value);
			prop.store(fos, "Updated common data");
			fos.close();
		}
		
		//Excel
		
		public String getExcelData(String sheetName, int rowNum, int cellNum) throws IOException {
			FileInputStream fis = new FileInputStream("./src/test/resources/Readers/Config.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);

			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);

			String data = cell.toString();

			wb.close();
			return data;
		}

		public void setExcelData(String sheetName, int rowNum, int cellNum, String value) throws IOException {
			FileInputStream fis = new FileInputStream("./src/test/resources/Readers/Train Ticket.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);

			Row row = sheet.getRow(rowNum);
			if (row == null) row = sheet.createRow(rowNum);

			Cell cell = row.getCell(cellNum);
			if (cell == null) cell = row.createCell(cellNum);

			cell.setCellValue(value);

			FileOutputStream fos = new FileOutputStream("./src/test/resources/Readers/Train Ticket.xlsx");
			wb.write(fos);

			wb.close();
			fos.close();
		}

		Actions act;

//		public ActionsUtility(WebDriver driver) {
//			this.driver = driver;
//			act = new Actions(driver);
//		}

		public void click(WebElement element) {
			act.moveToElement(element).click().perform();
		}

		public void sendKeys(WebElement element, String value) {
			act.moveToElement(element).click().sendKeys(value).perform();
		}

		public void clearAndType(WebElement element, String value) {
			act.moveToElement(element).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE)
					.sendKeys(value).perform();
		}

		public void selectByArrowDown(WebElement element, int count) {
			act.moveToElement(element).click().perform();
			for (int i = 0; i < count; i++) {
				act.sendKeys(Keys.ARROW_DOWN).perform();
			}
			act.sendKeys(Keys.ENTER).perform();
		}

		public void typeAndSelect(WebElement element, String value) throws InterruptedException {
			act.moveToElement(element).click().sendKeys(value).perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
		}
		
		//generate random number
		public int getRandomNumber(int range) {
			Random random=new Random();
			int randomnoinRange=random.nextInt(range);
			return randomnoinRange;		
		}
		//generate current date
		public String getCurrentdate(String format) {
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat(format);
			return sdf.format(date);
		}
		//counting days
		public String getRequiredDate(int days) {
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			sdf.format(date);
			Calendar cal=sdf.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH, days);
			String requiredDate=sdf.format(cal.getTime());
			return requiredDate;
		}
		//generate random value(Alphanumeric)
		public String getRandomValue() {
			UUID randomData=UUID.randomUUID();
			String value=randomData.toString().replaceAll("[^a-zA-Z]", "");
			return value;
		}
		
}
