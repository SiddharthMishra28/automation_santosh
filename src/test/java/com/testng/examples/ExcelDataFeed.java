package com.testng.examples;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataFeed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        File file = new File("Students.xlsx");
        try {
            FileInputStream fis = new FileInputStream(file);
            Workbook studentsWb = new XSSFWorkbook(fis); // USE XSSFWorkbook for xlsx and HSSFWorkbook for xls
            Sheet studentsSheet = studentsWb.getSheet("Search");
            int rowCount = studentsSheet.getLastRowNum();
            int colCount = studentsSheet.getRow(0).getLastCellNum();
            System.out.println("Row Count: "+rowCount);
            System.out.println("Col Count: "+colCount);
            for(int i=0; i<=rowCount; i++) {
                Row activeRow = studentsSheet.getRow(i);
                for(int j=0; j<colCount; j++) {
                    String activeCellData = activeRow.getCell(j).getStringCellValue();
                    System.out.print(activeCellData+" | ");
                    driver.findElement(By.name("q")).sendKeys(activeCellData);
                    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
                }
                System.out.println();
                Thread.sleep(3000);
                driver.get("https://www.google.com/");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
