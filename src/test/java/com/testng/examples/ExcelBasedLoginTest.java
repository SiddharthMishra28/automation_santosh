package com.testng.examples;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelBasedLoginTest {

    @Test(dataProvider = "loginDataProvider")
    public void loginDataTest(String userId, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/index.php");
        driver.findElement(By.name("uid")).sendKeys(userId);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage");
        driver.quit();

    }

    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() throws IOException {
        return getExcelLoginData("loginData");
    }

    public String[][] getExcelLoginData(String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(new File("Students.xlsx"));
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet(sheetName);
        int numRows = sheet.getPhysicalNumberOfRows();
        int numCols = sheet.getRow(0).getLastCellNum();
        System.out.println("Row Count : "+numRows);
        System.out.println("Col Count : "+numCols);
        String[][] excelArray = new String[numRows][numCols];
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<numCols; j++) {
                excelArray[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return excelArray;
    }
}
